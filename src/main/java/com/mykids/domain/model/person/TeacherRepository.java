/**
 * 
 */
package com.mykids.domain.model.person;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fmoriguchi
 *
 */
public interface TeacherRepository extends JpaRepository<Teacher, UUID> {

}
