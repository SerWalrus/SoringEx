package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Memo;
import fr.solutec.entities.User;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class SpringExApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepos;
	@Autowired
	private MemoRepository memoRepos;

	public static void main(String[] args) {
		SpringApplication.run(SpringExApplication.class, args);
		System.out.println("lancement terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement des instructions perso");

		User u1 = new User(null, "login", "mdp");
		User u2 = new User(null, "login2", "mdp2");
		User u3 = new User(null, "login3", "mdp3");

		userRepos.save(u1);
		userRepos.save(u2);
		userRepos.save(u3);

		Memo m1 = new Memo(null, null, "Ceci est le contenu du premier mémo", null, u1);
		Memo m2 = new Memo(null, null, "Ceci est le contenu du deuxième mémo", null, u1);
		Memo m3 = new Memo(null, null, "Ceci est le contenu du troisième mémo", null, u2);
		Memo m4 = new Memo(null, null, "Ceci est le contenu du quatrième mémo", null, u1);
		Memo m5 = new Memo(null, null, "Gaël est un loser", u1, u3);

		memoRepos.save(m1);
		memoRepos.save(m2);
		memoRepos.save(m3);
		memoRepos.save(m4);
		memoRepos.save(m5);

	}

}
