/**
 * 
 */
package com.mykids.domain.model.person;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.mykids.domain.model.EntityBase;

import lombok.AccessLevel;
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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public final class Kid extends EntityBase {

	@Embedded
	private Name name;

	@Column
	private LocalDate born;

	@Column
	private Gender gender;

	public Integer getAge() {

		return Period.between(this.born, LocalDate.now()).getYears();
	}
}
