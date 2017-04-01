/**
 * 
 */
package com.mykids.domain.model.person;

import static lombok.AccessLevel.PROTECTED;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author japa
 *
 */

@Entity
@Table

@Data
@Builder
@AllArgsConstructor(access=PROTECTED)
@NoArgsConstructor(access=PROTECTED)
public final class Teacher {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Embedded
	private Name name;
	
	@Column
	private LocalDate born;
	
	@Column
	private Gender gender;

}
