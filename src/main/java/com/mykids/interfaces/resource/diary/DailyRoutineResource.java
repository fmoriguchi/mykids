/**
 * 
 */
package com.mykids.interfaces.resource.diary;

import static org.springframework.http.ResponseEntity.notFound;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.diary.DailyRoutine;
import com.mykids.domain.model.diary.DailyRoutineRepository;
import com.mykids.domain.model.diary.Emotion;
import com.mykids.domain.model.diary.Nutrition;
import com.mykids.domain.model.person.Kid;

/**
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("daily-routines")
class DailyRoutineResource {

	private final DailyRoutineRepository dailyRoutines;

	DailyRoutineResource(DailyRoutineRepository dailyRoutines) {

		this.dailyRoutines = dailyRoutines;
	}

	@GetMapping
	Collection<DailyRoutineView> all(@RequestParam(defaultValue = "0") Integer page, 
			   								@RequestParam(defaultValue = "20") Integer size) {

		return dailyRoutines.findAll(PageRequest.of(page, size))
							.stream()
							.map(DailyRoutineView::by)
							.toList();
	}

	@GetMapping("{id}")
	ResponseEntity<DailyRoutineView> find(@PathVariable UUID id) {

		return dailyRoutines.findById(id)
							.map(DailyRoutineView::by)
							.map(ResponseEntity::ok)
							.orElse(notFound().build());
	}

	@PostMapping
	DailyRoutine store(@RequestBody DailyRoutineCreate dailyRoutine) {

		return dailyRoutines.save(dailyRoutine.to());
	}
	
	record DailyRoutineCreate(UUID kidId, LocalDate day, Emotion emotion, Nutrition nutrition) {
		
		DailyRoutine to() {
			
			return DailyRoutine
						.builder()
							.day(day)
							.emotion(emotion)
							.nutrition(nutrition)
						.build();
		}
	}
	
	record DailyRoutineView(UUID id, String name, LocalDate day, Emotion emotion, Nutrition nutrition) {
		 
		static final DailyRoutineView by(DailyRoutine dailyRoutine) {
			 
			return new DailyRoutineView(dailyRoutine.getId(),
				 					 	dailyRoutine.getKid().getName().getFullName(), 
				 					 	dailyRoutine.getDay(), 
				 					 	dailyRoutine.getEmotion(), 
				 					 	dailyRoutine.getNutrition());
		}
	} 
	 
	record KidView(String name) {

		public static final KidView by(Kid kid) {
			
			return new KidView(kid.getName().getFullName());
		}
	}
}
