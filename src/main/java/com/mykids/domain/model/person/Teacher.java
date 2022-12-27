/**
 * 
 */
package com.mykids.domain.model.person;

import static lombok.AccessLevel.PROTECTED;

import java.time.LocalDate;

import com.mykids.domain.model.EntityBase;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author fmoriguchi
 *
 */
@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
public final class Teacher extends EntityBase {

	@Embedded
	private Name name;

	@Column
	private LocalDate born;

	@Column
	private Gender gender;

}
