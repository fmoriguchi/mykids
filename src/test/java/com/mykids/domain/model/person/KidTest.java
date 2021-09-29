package com.mykids.domain.model.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * @author fmoriguchi
 *
 */
class KidTest {

	@Test
	void test() {

		// A
		Kid kid = Kid.builder().build();
		kid.setBorn(LocalDate.now().minusYears(10));

		// A
		int age = kid.getAge();

		// A
		assertEquals(age, 10);

	}

}
