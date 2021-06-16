package xyz.miguel.persona.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.miguel.persona.modelo.Pais;

/**
 * Interfaz que representa el repositorio asociado a un pais.
 * Un repositorio permite gestionar operaciones con los modelos.
 * Extiende de la clase JpaRepository y recibe la clase del modelo y el tipo de su id.
 * @author Migue
 *
 */
public interface PaisRepositorio extends JpaRepository<Pais, Long> {

}
