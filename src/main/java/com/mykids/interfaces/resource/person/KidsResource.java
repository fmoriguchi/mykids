/**
 * 
 */
package com.mykids.interfaces.resource.person;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.ResponseEntity.notFound;

import java.util.Collection;
import java.util.UUID;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public KidView create(@RequestBody KidCreate kid) {
		
		return KidView.of(kids.save(kid.to()));
	}

	@GetMapping
	public Collection<KidView> all(@RequestParam(defaultValue = "0") Integer page, 
								   @RequestParam(defaultValue = "20") Integer size) {
		
		return kids.findAll(PageRequest.of(page, size))
				   .stream()
				   .map(KidView::of)
				   .collect(toList());
	}

	@GetMapping(path = "{id}")
	public ResponseEntity<KidView> find(@PathVariable UUID id) {

		return kids.findById(id)
				   .map(KidView::of)
				   .map(ResponseEntity::ok)
				   .orElse(notFound().build());
	}
}
