/**
 * 
 */
package com.mykids.domain.model.person;

import static lombok.AccessLevel.PROTECTED;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.mykids.domain.model.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author japa
 *
 */
@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor(access=PROTECTED)
@NoArgsConstructor(access=PROTECTED)
public final class Teacher extends BaseEntity   {
	
	@Embedded
	private Name name;
	
	@Column
	private LocalDate born;
	
	@Column
	private Gender gender;

}
