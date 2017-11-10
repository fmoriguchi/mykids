/**
 * 
 */
package com.mykids.domain.model.diary;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import com.mykids.domain.model.EntityBase;
import com.mykids.domain.model.person.Kid;

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
