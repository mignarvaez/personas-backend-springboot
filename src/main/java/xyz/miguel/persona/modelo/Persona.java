package xyz.miguel.persona.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que representa a una persona. Se le indica que es una entidad y una tabla con anotaciones
 * @author Migue
 *
 */
@Entity
@Table(name = "persona")
public class Persona {

    //-----------------------------------------------------------------
    // Atributos
    //----------------------------------------------------------------- 
	
	/**
	 * La identificación de la persona. Este id se generara de forma automatica para cada elemento nuevo que se agregue
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * El nombre de la persona
	 */
	private String nombre;
	
	/**
	 * El apellido de la persona
	 */
	private String apellido;
	
	/**
	 * La edad de la persona
	 */
	private int edad;
	
	/**
	 * El correo de la persona
	 */
	private String correo;
	
	/**
	 * El estado donde reside la persona. Es una relación de uno a muchos, donde un estado puede tener muchas personas
	 * Pero una persona solo puede tener un estado. El join se hace con la columna id de estado, en este caso se le pone el nombre
	 * id_estado.
	 */
	@ManyToOne
	@JoinColumn(name="id_estado")
	private Estado estado;



	//-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
    public Persona(String nombre, String apellido, int edad, String correo, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.estado = estado;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
