/**
 * 
 */
package com.mykids.interfaces.resource.diary;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.diary.DailyRoutine;
import com.mykids.domain.model.diary.DailyRoutineRepository;

/**
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("dailyroutines")
public class DailyRoutineResource {

	private final DailyRoutineRepository dailyRoutines;

	@Autowired
	public DailyRoutineResource(DailyRoutineRepository dailyRoutines) {

		this.dailyRoutines = dailyRoutines;
	}

	@GetMapping
	public Collection<DailyRoutine> all() {

		return dailyRoutines.findAll();
	}

	@PostMapping
	@Transactional
	public DailyRoutine store(DailyRoutine dailyRoutine) {

		return dailyRoutines.save(dailyRoutine);
	}
}
