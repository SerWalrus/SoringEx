package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;

@RestController
@CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepos;

	@GetMapping("memo/user/{id}")
	public List<Memo> getMemoById(@PathVariable Long id) {
		return memoRepos.findByUserId(id);
	}

	@GetMapping("memo")
	public Iterable<Memo> getAllMemos() {
		return memoRepos.findAll();
	}

	@PostMapping("sendMemo")
	public Memo sendMemo(@RequestBody Memo m) {
		return memoRepos.save(m);
	}

	@GetMapping("memo/{id}")
	public Optional<Memo> getDate(@PathVariable Long id) {
		return memoRepos.findById(id);
	}

}
