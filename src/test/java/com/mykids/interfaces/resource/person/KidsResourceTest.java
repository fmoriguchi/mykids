package com.mykids.interfaces.resource.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mykids.domain.model.person.Gender;

@SpringBootTest
class KidsResourceTest {

	@Autowired
	private KidsResource kids;

	@Test
	void createTest() {

		// A A
		var kid = kids.create(new KidCreate("Fabio", "Moriguchi", "Japa", LocalDate.of(1982, 4, 15), Gender.MALE));

		// A
		assertNotNull(kid);
		assertNotNull(kid.id());
		assertEquals("Fabio Moriguchi", kid.fullName());
	}

	@Test
	void findTest() {

		// A
		var id = kids.create(new KidCreate("Fabio", "Moriguchi", "Japa", LocalDate.of(1982, 4, 15), Gender.MALE)).id();

		// A
		var kid = kids.find(id).getBody();

		// A
		assertNotNull(kid);
		assertEquals("Fabio Moriguchi", kid.fullName());
	}
	
	@Test
	void allTest() {
		
		//A 
		kids.create(new KidCreate("Fabio", "Moriguchi", "Japa", LocalDate.of(1982, 4, 15), Gender.MALE));
		kids.create(new KidCreate("Ryo", "Sakazaki", "Ryo", LocalDate.of(1957, 8, 2), Gender.MALE));
		kids.create(new KidCreate("Terry", "Bogard", "Fata", LocalDate.of(1971, 3, 15), Gender.MALE));
		
		// A
		var all = kids.all(1, 2);

		// A
		assertEquals(2, all.size());
	}

}
