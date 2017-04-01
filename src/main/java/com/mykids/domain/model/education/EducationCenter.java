/**
 * 
 */
package com.mykids.domain.model.education;

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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public final class EducationCenter {

	private Long id;
	private String name;
	private Address address;
}
