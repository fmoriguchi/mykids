/**
 * 
 */
package com.mykids.interfaces.resource.person;

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

import com.mykids.domain.model.person.Kid;
import com.mykids.domain.model.person.KidsRepository;

/**
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("kids")
class KidsResource {

	private final KidsRepository kids;

	KidsResource(KidsRepository kids) {
		
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

	@GetMapping(path = "{id}")
	public ResponseEntity<Kid> find(@PathVariable("id") UUID id) {

		return this.kids.findById(id)
						.map(ResponseEntity::ok)
						.orElse(notFound().build());
	}
}
