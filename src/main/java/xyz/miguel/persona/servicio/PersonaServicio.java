package xyz.miguel.persona.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import xyz.miguel.persona.modelo.Persona;
import xyz.miguel.persona.repositorio.PersonaRepositorio;

/**
 * Servicio asociado a una persona de la aplicación
 * Un servicio es la implementación de un repositorio
 * @author Migue
 *
 */
@Service
public class PersonaServicio implements PersonaRepositorio {
	
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
	 * El repositorio correspondiente al servicio.
	 * Se usa la anotación autowired para que se cree el objeto asociado sin tener que instanciarlo con un new,
	 * Es decir, lo que permite inyectar unas dependencias con otras dentro de Spring
	 */
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
	
	@Override
	public List<Persona> findAll() {
		return personaRepositorio.findAll();
	}

	@Override
	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Persona> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> S save(S entity) {
		return personaRepositorio.save(entity);
	}

	@Override
	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return personaRepositorio.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		personaRepositorio.deleteById(id);
	}

	@Override
	public void delete(Persona entity) {
		personaRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Persona> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Persona> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
