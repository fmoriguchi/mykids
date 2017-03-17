package com.mykids;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mykids.domain.model.Gender;
import com.mykids.domain.model.Kid;
import com.mykids.domain.model.KidsRepository;
import com.mykids.domain.model.Name;

@SpringBootApplication
public class MykidsApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(MykidsApplicationBoot.class, args);
	}

	@Bean
	public CommandLineRunner registerRecords(KidsRepository repository) {

		return (args) -> {

			repository.create(new Kid(new Name("Maria", "Elisa Moriguchi", "Pitucha"), LocalDate.of(2012,Month.JULY, 31), Gender.FEMALE));
		};
	}
}
