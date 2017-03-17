/**
 * 
 */
package com.mykids.interfaces.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykids.domain.model.Kid;
import com.mykids.domain.model.KidsRepository;

/**
 * @author japa
 *
 */
@RestController
@RequestMapping("/kids")
public class KidsResource {

	@Autowired
	private KidsRepository kids;

	@PostMapping
	public Kid create(Kid kid) {
		return kids.create(kid);
	}

	@GetMapping
	public Collection<Kid> all() {
		return this.kids.all();
	}

}
