package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Events;

public interface EventRepository extends CrudRepository<Events, Long>{

}
