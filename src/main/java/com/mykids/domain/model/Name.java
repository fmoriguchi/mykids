/**
 * 
 */
package com.mykids.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author japa
 *
 */
@Embeddable
public final class Name {

	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String nickName;

	protected Name() {}

	public Name(String firstName, String lastName, String nickName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
