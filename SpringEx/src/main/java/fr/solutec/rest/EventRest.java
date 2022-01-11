package fr.solutec.rest;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Events;
import fr.solutec.entities.Memo;
import fr.solutec.repository.EventRepository;

@RestController
@CrossOrigin("*")
public class EventRest {

	@Autowired
	private EventRepository eventRepo;
	
	
	@PostMapping("createEvent")
	public Events createEvent(@RequestBody Events e) {
		return eventRepo.save(e);
	}
	
	@GetMapping("event_passe")
	public  List<Events> getpEventsByDate(){
		Date d = new Date();
		return eventRepo.findByDateEventBefore(d);
	}
	
	@GetMapping("event_futur")
	public  List<Events> getfEventsByDate(){
		Date d = new Date();
		return eventRepo.findByDateEventAfter(d);
	}
}
