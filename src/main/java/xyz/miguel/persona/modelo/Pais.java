package xyz.miguel.persona.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa un país. Se le indica que es una entidad y una tabla con anotaciones
 * @author Migue
 *
 */
@Entity
@Table(name = "pais")
public class Pais {

    //-----------------------------------------------------------------
    // Atributos
    //----------------------------------------------------------------- 
	
	/**
	 * La id del pais. Este id se generara de forma automatica para cada elemento nuevo que se agregue
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * El nombre del pais
	 */
	private String nombre;



	//-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
	public Pais() {
		// TODO Auto-generated constructor stub
	}
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
