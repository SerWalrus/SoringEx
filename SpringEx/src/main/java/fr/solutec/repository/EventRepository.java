package fr.solutec.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Events;

public interface EventRepository extends CrudRepository<Events, Long>{

	public List<Events> findByDateEventBefore(Date d);
	
	public List<Events> findByDateEventAfter(Date d);
	@Query(value = "SELECT e FROM Events e WHERE e.dateEvent<?1")
	public List<Events> trouverEventsPasse(Date d);
}
