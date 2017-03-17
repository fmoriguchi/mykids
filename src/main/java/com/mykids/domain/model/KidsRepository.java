/**
 * 
 */
package com.mykids.domain.model;

import java.util.Collection;

/**
 * @author japa
 *
 */
public interface KidsRepository {// extends JpaRepository<Kid, Long>{

	Kid create(Kid kid);

	void remove(Kid kid);

	Collection<Kid> all();
}
