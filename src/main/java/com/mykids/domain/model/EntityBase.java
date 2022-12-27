package com.mykids.domain.model;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.GeneratedValue;
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
	//@Type(type = "uuid-char")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
}
