package br.com.medeirosdev.deploy;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}

@RestController
@RequestMapping
class HelloController {

	@GetMapping("/ping")
	String hello() {
		return "pong!";
	}
}

@RestController
@RequestMapping("/person")
class PersonController {

	@GetMapping
	Person getSomePerson() {
		return new Person(new Faker().name().firstName(), new Faker().name().lastName());
	}
}

record Person(String firstName, String lastName) {}

record Student(String name, Integer average, Integer register) {}