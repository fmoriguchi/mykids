package com.mykids.domain.model;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fmoriguchi
 *
 */
@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(of = "id")
public abstract class EntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
}
