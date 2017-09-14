/**
 * 
 */
package com.mykids.domain.model.education;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.mykids.domain.model.BaseEntity;
import com.mykids.domain.model.localization.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author japa
 *
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EducationCenter extends BaseEntity {

	@Column
	private String name;

	@ManyToOne
	private Address address;
}
