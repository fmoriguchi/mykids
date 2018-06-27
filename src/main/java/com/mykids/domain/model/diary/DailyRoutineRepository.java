/**
 * 
 */
package com.mykids.domain.model.diary;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fmoriguchi
 *
 */
@Repository
public interface DailyRoutineRepository extends JpaRepository<DailyRoutine, UUID> {

}
