package br.com.medeirosdev.deploy;

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
@RequestMapping("/")
class HelloController {

	@GetMapping
	String hello() {
		return "Hello World!";
	}
	@GetMapping("/2")
	String hello2() {
		return "Hello World! 2";
	}
	@GetMapping("/jhonata-teste")
	Person jhonataTeste() {
		return new Person("Jhonata", "Medeiros");
	}
	@GetMapping("/paulo")
	Person pauloTeste() {
		return new Person("Paulo", "Medeiros");
	}
	@GetMapping("/teste")
	Student testeStudent() {
		return new Student("Aluno teste", 60, 44412314);
	}
}

record Person(String firstName, String lastName) {}

record Student(String name, Integer average, Integer register) {}