/**
 * 
 */
package com.mykids.domain.model.diary;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author japa
 *
 */
@Data
@Builder
@Embeddable 
//@EqualsAndHashCode(of = "id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public final class Nutrition {

/*	@Id
	@GeneratedValue
	private Integer id;*/
	
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
