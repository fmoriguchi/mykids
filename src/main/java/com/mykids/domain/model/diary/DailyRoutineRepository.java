/**
 * 
 */
package com.mykids.domain.model.diary;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fmoriguchi
 *
 */
public interface DailyRoutineRepository extends JpaRepository<DailyRoutine, UUID> {

}
