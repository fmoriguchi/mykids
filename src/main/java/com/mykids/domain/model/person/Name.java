/**
 * 
 */
package com.mykids.domain.model.person;

import static lombok.AccessLevel.PROTECTED;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fmoriguchi
 *
 */
@Data
@Builder
@Embeddable
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
public final class Name {

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String nickName;

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
