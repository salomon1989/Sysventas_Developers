package sysventas.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SysventasDevelopersApplication {
    @GetMapping("/hola")
	public static void main(String[] args) {
		SpringApplication.run(SysventasDevelopersApplication.class, args);
	}

}
