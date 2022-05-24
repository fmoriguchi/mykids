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
		var kid = Kid.builder().build();
		kid.setBorn(LocalDate.now().minusYears(10));

		// A
		var age = kid.getAge();

		// A
		assertEquals(10, age);

	}

}
