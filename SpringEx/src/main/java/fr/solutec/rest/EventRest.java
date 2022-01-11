package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Events;
import fr.solutec.repository.EventRepository;

@RestController
@CrossOrigin("*")
public class EventRest {

	@Autowired
	private EventRepository eventRepo;
	
	@PostMapping("sendMemo")
	public Events createEvent(@RequestBody Events e) {
		return eventRepo.save(e);
	}
}
