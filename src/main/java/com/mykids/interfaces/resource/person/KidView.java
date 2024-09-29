/**
 * 
 */
package com.mykids.interfaces.resource.person;

import java.time.LocalDate;
import java.util.UUID;

import com.mykids.domain.model.person.Gender;
import com.mykids.domain.model.person.Kid;

/**
 * @author fmoriguchi
 *
 */
record KidView(UUID id, String fullName, String nickName, LocalDate born, Gender gender, Integer age) {

	static final KidView of(Kid kid) {
		
		return new KidView(kid.getId(),
						   kid.getName().getFullName(), 
						   kid.getName().getNickName(), 
						   kid.getBorn(), 
						   kid.getGender(), 
						   kid.getAge());
	}
}
