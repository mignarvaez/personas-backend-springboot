package xyz.miguel.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.miguel.persona.modelo.Estado;
import xyz.miguel.persona.servicio.EstadoServicio;

/**
 * Rest asociado al estado
 * Se usa la notaci�n RestController que marca a la clase como un controlador
 * en el que cada metodo retorna un objeto del dominio en vez de una vista
 * Con RequestMapping se le indicar� que la ruta base asociada a los servicios
 * de esta clase es /estados/
 * @author Migue
 *
 */
@RestController
@RequestMapping("/estados/")
public class EstadoREST {
	
	//-----------------------------------------------------------------
	// Atributos
	//-----------------------------------------------------------------

	/**
	 * Se importa el servicio asociado a estado con la anotaci�n autowired
	 */
	@Autowired
	private EstadoServicio estadoServicio;
	
    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------
	
	/**
	 * M�todo que retorna una lista de todos los estados seg�n un pais dado en una respuesta HTTP adecuada
	 * @return La lista de todos los estados que corresponden al pais dado por par�metro
	 * Recibe la anotaci�n getMapping indicando que responde a peticiones GET teniendo en cuenta una id, que ser�
	 * pasada al parametro idPais con pathVariable
	 */
	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable(name = "id") long idPais){
		//Retorna una respuesta HTTP de tipo ok(200) con la lista de todos los estados segun el pais dado
		return ResponseEntity.ok(estadoServicio.findAllByCountry(idPais));
	}
}
