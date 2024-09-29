/**
 * 
 */
package com.mykids.interfaces.resource.person;

import java.time.LocalDate;

import com.mykids.domain.model.person.Gender;
import com.mykids.domain.model.person.Kid;
import com.mykids.domain.model.person.Name;

/**
 * @author fmoriguchi
 *
 */
record KidCreate(String firstName, String lastName, String nickName, LocalDate born, Gender gender) {
	
	Kid to() {
		
		return Kid.builder()
				.born(born)
				.gender(gender)
				.name(new Name(firstName, lastName, nickName))
				.build();
	}
}
