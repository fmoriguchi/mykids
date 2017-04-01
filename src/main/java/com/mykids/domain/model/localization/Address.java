/**
 * 
 */
package com.mykids.domain.model.localization;

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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public final class Address {

	private Long id;
	private Integer number;
	private Street street;
	private City city;
	private String postcode;
}
