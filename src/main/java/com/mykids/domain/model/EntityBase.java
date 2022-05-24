package com.mykids.domain.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
	@Type(type = "uuid-char")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
}
