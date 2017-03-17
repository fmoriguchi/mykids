/**
 * 
 */
package com.mykids.infrastructure.memory;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mykids.domain.model.Gender;
import com.mykids.domain.model.Kid;
import com.mykids.domain.model.Name;

/**
 * @author japa
 *
 */
@Repository
@Scope("singleton")
public class KidsMemory { //implements KidsRepository {

	private final Map<Long, Kid> kids = new HashMap<>();

	public KidsMemory() {
		this.initialize();
	}

	//@Override
	public Kid create(Kid kid) {

		kid.setId(generateID());

		this.kids.put(kid.getId(), kid);

		return kid;
	}

	//@Override
	public void remove(Kid kid) {
		this.kids.remove(kid.getId());
	}

	//@Override
	public Collection<Kid> all() {
		return this.kids.values();
	}

	private void initialize() {
		Kid maria = new Kid(new Name("Maria", "Elisa Moriguchi", "Pitucha"), LocalDate.of(2012, Month.JULY, 31), Gender.FEMALE);

		this.create(maria);

	}

	private Long generateID() {
		return System.currentTimeMillis();// UUID.randomUUID().timestamp();
	}
}
