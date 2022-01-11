package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class SpringExApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepos;

	public static void main(String[] args) {
		SpringApplication.run(SpringExApplication.class, args);
		System.out.println("lancement terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("lancement des instructions perso");

		User u1 = new User(null, "login", "mdp");
		User u2 = new User(null, "login2", "mdp2");
		User u3 = new User(null, "login3", "mdp3");

		userRepos.save(u1);
		userRepos.save(u2);
		userRepos.save(u3);
	}

}
