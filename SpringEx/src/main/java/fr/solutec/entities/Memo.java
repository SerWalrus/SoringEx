package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Memo {
	@Id
	@GeneratedValue
	private Long id;
	@CreationTimestamp
	private Date date_creation;
	private String contenu;
	private User desinataire;
	@ManyToOne
	private User user;
}
