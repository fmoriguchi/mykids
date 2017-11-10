/**
 * 
 */
package com.mykids.domain.model.localization;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;

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
public final class Country extends EntityBase {

	@Column
	private Locale locale;

	@Column
	private String name;
}
