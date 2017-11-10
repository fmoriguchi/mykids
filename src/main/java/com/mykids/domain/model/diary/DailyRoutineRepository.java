/**
 * 
 */
package com.mykids.domain.model.diary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fmoriguchi
 *
 */
@Repository
public interface DailyRoutineRepository extends JpaRepository<DailyRoutine, String> {

}
