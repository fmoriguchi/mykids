/**
 * 
 */
package com.mykids.domain.model.diary;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fmoriguchi
 *
 */
@Builder
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public final class Nutrition {

	@Column
	@Enumerated(EnumType.STRING)
	private Eat breakfast;

	@Column
	@Enumerated(EnumType.STRING)
	private Eat lunch;

	@Column
	@Enumerated(EnumType.STRING)
	private Eat coffebreak;

	@Column
	@Enumerated(EnumType.STRING)
	private Eat dinner;
}
