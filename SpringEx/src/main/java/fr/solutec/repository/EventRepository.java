package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Events;

public interface EventRepository extends CrudRepository<Events, Long>{

	public List<Events> findByEventId(Long id);
}
