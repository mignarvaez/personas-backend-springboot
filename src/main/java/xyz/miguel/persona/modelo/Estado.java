package xyz.miguel.persona.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que representa un estado de un pais. Se le indica que es una entidad y una tabla con anotaciones
 * @author Migue
 *
 */
@Entity
@Table(name = "estado")
public class Estado {

	/**
	 * La id del estado. Este id se generara de forma automatica para cada elemento nuevo que se agregue
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * El país al que pertenece el estado. Es una relación de uno a muchos, donde un pais puede tener muchos estados
	 * Pero un estado solo puede tener un pais. El join se hace con la columna id de pais, en este caso se le pone el nombre
	 * id_pais
	 */
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	/**
	 * El nombre del estado
	 */
	private String nombre;
	
	//-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
	public Estado(Pais pais, String nombre) {
		super();
		this.pais = pais;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
