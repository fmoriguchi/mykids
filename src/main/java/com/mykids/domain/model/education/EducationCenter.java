/**
 * 
 */
package com.mykids.domain.model.education;

import com.mykids.domain.model.EntityBase;
import com.mykids.domain.model.localization.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author fmoriguchi
 *
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EducationCenter extends EntityBase {

	@Column
	private String name;

	@ManyToOne
	private Address address;
}
