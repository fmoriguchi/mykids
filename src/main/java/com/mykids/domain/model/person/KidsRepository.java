/**
 * 
 */
package com.mykids.domain.model.person;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fmoriguchi
 *
 */
public interface KidsRepository extends JpaRepository<Kid, String> {

}
