/**
 * 
 */
package com.mykids.infrastructure.database;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mykids.domain.model.Kid;
import com.mykids.domain.model.KidsRepository;

/**
 * @author japa
 *
 */
@Repository
public class KidsDAO implements KidsRepository {

	@PersistenceContext
	private final EntityManager manager;
	
	
	public KidsDAO(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	@Transactional
	public Kid create(Kid kid) {
		this.manager.persist(kid);
		return kid;
	}

	@Override
	public void remove(Kid kid) {
		this.manager.remove(kid);
	}

	@Override
	public Collection<Kid> all() {
		return manager.createQuery("from Kid", Kid.class)
					  .getResultList();
	}

}
