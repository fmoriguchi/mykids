package com.mykids;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mykids.domain.model.person.Gender;
import com.mykids.domain.model.person.Kid;
import com.mykids.domain.model.person.KidsRepository;
import com.mykids.domain.model.person.Name;

@SpringBootApplication
public class MykidsApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(MykidsApplicationBoot.class, args);
	}

	@Bean
	public CommandLineRunner registerRecords(KidsRepository repository) {

		return (args) -> {
			
			Kid maria = Kid.builder()
					.born(LocalDate.of(2012,Month.JULY,31))
					.gender(Gender.FEMALE)
					.name(Name.builder().firstName("Maria")
							            .lastName("Elisa Moriguchi")
							            .nickName("Picurrucha")
					           .build())
					.build();
			
			repository.save(maria);
		};
	}
}
