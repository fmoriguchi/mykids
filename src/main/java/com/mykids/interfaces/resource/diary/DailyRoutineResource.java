/**
 * 
 */
package com.mykids.interfaces.resource.diary;

import static org.springframework.http.ResponseEntity.notFound;

import java.util.Collection;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.diary.DailyRoutine;
import com.mykids.domain.model.diary.DailyRoutineRepository;

/**
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("daily-routines")
class DailyRoutineResource {

	private final DailyRoutineRepository dailyRoutines;

	DailyRoutineResource(DailyRoutineRepository dailyRoutines) {

		this.dailyRoutines = dailyRoutines;
	}

	@GetMapping
	public Collection<DailyRoutine> all() {

		return dailyRoutines.findAll();
	}

	@GetMapping("{id}")
	public ResponseEntity<DailyRoutine> find(@PathVariable UUID id) {

		return dailyRoutines.findById(id)
							.map(ResponseEntity::ok)
							.orElse(notFound().build());
	}

	@PostMapping
	public DailyRoutine store(@RequestBody DailyRoutine dailyRoutine) {

		return dailyRoutines.save(dailyRoutine);
	}
}
