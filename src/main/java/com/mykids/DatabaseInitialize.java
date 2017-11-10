/**
 * 
 */
package com.mykids;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.mykids.domain.model.diary.DailyRoutine;
import com.mykids.domain.model.diary.DailyRoutineRepository;
import com.mykids.domain.model.diary.Eat;
import com.mykids.domain.model.diary.Emotion;
import com.mykids.domain.model.diary.Nutrition;
import com.mykids.domain.model.person.Gender;
import com.mykids.domain.model.person.Kid;
import com.mykids.domain.model.person.KidsRepository;
import com.mykids.domain.model.person.Name;

/**
 * @author fmoriguchi
 *
 */
@Configuration
class DatabaseInitialize {
	
	@Bean
	@Transactional
	CommandLineRunner registerRecords(KidsRepository kids, DailyRoutineRepository dailyRoutines) {

		return (args) -> {
			
			Kid maria = Kid.builder()
					.born(LocalDate.of(2012,Month.JULY,31))
					.gender(Gender.FEMALE)
					.name(Name.builder().firstName("Maria")
							            .lastName("Elisa Moriguchi")
							            .nickName("Picurrucha")
							            .build())
					.build();
			
			Kid fabio = Kid.builder()
					.born(LocalDate.of(1982,Month.APRIL,15))
					.gender(Gender.MALE)
					.name(Name.builder().firstName("Fabio")
							            .lastName("Hiromitsu Moriguchi")
							            .nickName("Japa")
							            .build())
					.build();
			
			
			kids.save(maria);
			kids.save(fabio);
			
			
			Nutrition nutrition = Nutrition.builder()
											.breakfast(Eat.ENOUGH)
											.lunch(Eat.LOT)
											.coffebreak(Eat.NOTTING)
											.dinner(Eat.GOOD)
											.build();
			
			DailyRoutine today = DailyRoutine.builder()
											 .day(LocalDate.now())
											 .kid(maria)
											 .emotion(Emotion.HAPPY)
											 .nutrition(nutrition)
											 .build();
			
			dailyRoutines.save(today);
		};
	}

}
