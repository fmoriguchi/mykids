/**
 * 
 */
package com.mykids.interfaces.resource.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.diary.DailyRoutine;
import com.mykids.domain.model.diary.DailyRoutineRepository;

/**
 * @author japa
 *
 */
@RestController
@RequestMapping("dailyroutine")
public class DailyRoutineResource {

	@Autowired
	private final DailyRoutineRepository repository;

	public DailyRoutineResource(DailyRoutineRepository repository) {

		this.repository = repository;
	}
	
	@GetMapping
	public Iterable<DailyRoutine> all() {
		
		return repository.findAll();
	}
	
	@PostMapping
	@Transactional
	public DailyRoutine store(DailyRoutine dailyRoutine) {
		
		return repository.save(dailyRoutine);
	}
}
