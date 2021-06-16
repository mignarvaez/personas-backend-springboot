package xyz.miguel.persona.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.miguel.persona.modelo.Persona;

/**
 * Interfaz que representa el repositorio asociado a una persona.
 * Un repositorio permite gestionar operaciones con los modelos.
 * Extiende de la clase JpaRepository y recibe la clase del modelo y el tipo de su id.
 * @author Migue
 *
 */
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
