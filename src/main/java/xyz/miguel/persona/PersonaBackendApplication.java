package xyz.miguel.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PersonaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaBackendApplication.class, args);
	}
	
	//Configuración para permitir peticiones crossorigin, en este caso se configura
	//para permitir peticiones que vengan del cliente angular que corre en el puerto 4200
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
