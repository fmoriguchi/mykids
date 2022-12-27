/**
 * 
 */
package com.mykids.domain.model.localization;

import com.mykids.domain.model.EntityBase;

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
public final class Street extends EntityBase {

	@Column
	private String name;

	@ManyToOne
	private Neighborhood neighborhood;
}
