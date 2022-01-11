package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Ami;
import fr.solutec.repository.AmiRepository;

@RestController
@CrossOrigin("*")
public class AmiRest {
	@Autowired
	private AmiRepository amiRepo;

	@PostMapping("demande_ami")
	public Ami demandeAmi(@RequestBody Ami a) {
		return amiRepo.save(a);
	}

	@PutMapping("accepte_ami")
	public Ami accepteAmi(@RequestBody Ami a) {
		a.setAccepte(true);
		return amiRepo.save(a);
	}

}
