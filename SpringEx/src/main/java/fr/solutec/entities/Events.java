package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Events {
	@Id @GeneratedValue
	private Long id;
	private String titre;
	private String description;
	private Date date_event;
	@ManyToOne
	private User desinataire;
	@ManyToOne
	private User user;
}
