/**
 * 
 */
package com.mykids.domain.model.diary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author japa
 *
 */
@Repository
public interface DailyRoutineRepository extends CrudRepository<DailyRoutine, String> {

}
