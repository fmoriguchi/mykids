/**
 * 
 */
package com.mykids.domain.model.person;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author japa
 *
 */
@Table
@Entity

@Data
@Builder
@EqualsAndHashCode(of="id")
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PROTECTED)
public final class Kid implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

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
