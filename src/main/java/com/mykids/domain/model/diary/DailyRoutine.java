/**
 * 
 */
package com.mykids.domain.model.diary;

import java.time.LocalDate;

import com.mykids.domain.model.EntityBase;
import com.mykids.domain.model.person.Kid;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author fmoriguchi
 *
 */
@Entity
@Builder
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public final class DailyRoutine extends EntityBase {

	@Column
	private LocalDate day;

	@Column
	@Enumerated(EnumType.STRING)
	private Emotion emotion;

	@Embedded
	private Nutrition nutrition;

	@OneToOne
	private Kid kid;
}