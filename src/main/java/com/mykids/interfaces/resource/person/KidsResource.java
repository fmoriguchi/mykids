/**
 * 
 */
package com.mykids.interfaces.resource.person;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.person.Kid;
import com.mykids.domain.model.person.KidsRepository;

/**
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("/kids")
public class KidsResource {

	private final KidsRepository kids;
	
	@Autowired
	public KidsResource(KidsRepository kids) {
		this.kids = kids;
	}

	@PostMapping
	public Kid create(@RequestBody Kid kid) {
		return kids.save(kid);
	}

	@GetMapping
	public Collection<Kid> all() {
		return this.kids.findAll();
	}

	@GetMapping(path = "/{id}")
	public Kid find(@PathVariable("id") String id) {

		return this.kids.findOne(id);
	}

}
