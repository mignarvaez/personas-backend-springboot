package xyz.miguel.persona.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.miguel.persona.modelo.Persona;
import xyz.miguel.persona.servicio.PersonaServicio;

/**
 * Rest asociado a una persona
 * Se usa la notación RestController que marca a la clase como un controlador
 * en el que cada metodo retorna un objeto del dominio en vez de una vista
 * Con RequestMapping se le indicará que la ruta base asociada a los servicios
 * de esta clase es /personas/
 * @author Migue
 *
 */
@RestController
@RequestMapping("/personas/")
public class PersonaREST {
	
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
	 * Se importa el servicio asociado a Pais con la anotación autowired
	 */
	@Autowired
	private PersonaServicio personaServicio;
	
	/**
	 * Método que retorna una lista de todos las personas en una respuesta HTTP adecuada
	 * @return La lista de todas las personas de la aplicación
	 * Recibe la anotación getMapping indicando que responde a peticiones GET
	 */
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas(){
		//Retorna una respuesta HTTP de tipo ok(200) con la lista de todas las personas
		return ResponseEntity.ok(personaServicio.findAll());
	}
	
	/**
	 * Método encargado de almacenar una nueva persona
	 * Recibe por parametro una persona que corresponde al body de la petición realizada
	 * Se le asigna la anotación PostMapping indicando que responde a peticiones Post.
	 * @return
	 */
	@PostMapping
	private ResponseEntity<Persona>savePersona(@RequestBody Persona persona){
		
		//Se guarda la persona y se la almacena en una variable
		Persona miPersona = personaServicio.save(persona);
		//Se genera una respuesta con la uri hacia la persona creada con la información de la misma
		try {
			return ResponseEntity.created(new URI("/personas/"+miPersona.getId())).body(miPersona);
		} catch (Exception e) {
			//Si no se puede almacenar la persona se retorna un mensaje de error 400 informando del error sin ningun body(con build())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		} 
	}
	
	/**
	 * Método encargado de eliminar una persona según su id
	 * Recibe por parametro un id que se encuenta relacionado con el parámetor de la url usando PathVariable	
	 */
	@DeleteMapping(value="delete/{id}")
	private ResponseEntity<Boolean>deletePersona(@PathVariable("id") Long id){
		//Se elimina la persona
		personaServicio.deleteById(id);
		//Retorna una respuesta de tipo 200 informando si se elimino(true) o no (false) la persona.
		return ResponseEntity.ok(!personaServicio.existsById(id));
	}
}
