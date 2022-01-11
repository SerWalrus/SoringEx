package fr.solutec.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Memo;

public interface MemoRepository extends CrudRepository<Memo, Long> {

	public Optional<Memo> findByDateCreation(Date date);

}
