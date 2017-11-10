/**
 * 
 */
package com.mykids.domain.model.localization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.mykids.domain.model.EntityBase;

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
public final class Address extends EntityBase {

	@Column
	private Integer number;

	@ManyToOne
	private Street street;

	@ManyToOne
	private City city;

	@Column
	private String postcode;
}
