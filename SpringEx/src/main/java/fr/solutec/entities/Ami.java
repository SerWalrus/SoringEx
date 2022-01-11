package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ami {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private User demandeur;
	@ManyToOne
	private User receveur;

	private boolean accepte;

}
