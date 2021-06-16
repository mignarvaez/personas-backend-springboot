package xyz.miguel.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.miguel.persona.modelo.Pais;
import xyz.miguel.persona.servicio.PaisServicio;

/**
 * Rest asociado al Pais
 * Se usa la notación RestController que marca a la clase como un controlador
 * en el que cada metodo retorna un objeto del dominio en vez de una vista
 * Con RequestMapping se le indicará que la ruta base asociada a los servicios
 * de esta clase es /paises/
 * @author Migue
 *
 */
@RestController
@RequestMapping("/paises/")
public class PaisREST {
	
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
	 * Se importa el servicio asociado a Pais con la anotación autowired
	 */
	@Autowired
	private PaisServicio paisServicio;
	
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
	
	/**
	 * Método que retorna una lista de todos los paises en una respuesta HTTP adecuada
	 * @return La lista de todos los paises de la aplicación
	 * Recibe la anotación getMapping indicando que responde a peticiones GET
	 */
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises (){
		
		//Retorna una respuesta HTTP de tipo ok(200) con la lista de todos los paises
		return ResponseEntity.ok(paisServicio.findAll());
	}
	
}
