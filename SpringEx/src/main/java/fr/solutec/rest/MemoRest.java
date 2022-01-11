package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;

@RestController
@CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepo;

	@GetMapping("memo/{id}")
	public Optional<Memo> getDate(@PathVariable Long id) {
		return memoRepo.findById(id);
	}

}
