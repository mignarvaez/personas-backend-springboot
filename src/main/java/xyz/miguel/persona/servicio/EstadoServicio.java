package xyz.miguel.persona.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import xyz.miguel.persona.modelo.Estado;
import xyz.miguel.persona.repositorio.EstadoRepositorio;

/**
 * Servicio asociado a un estado de la aplicación
 * Un servicio es la implementación de un repositorio
 * @author Migue
 *
 */
@Service
public class EstadoServicio implements EstadoRepositorio{
	
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
	 * El repositorio correspondiente al servicio.
	 * Se usa la anotación autowired para que se cree el objeto asociado sin tener que instanciarlo con un new,
	 * Es decir, lo que permite inyectar unas dependencias con otras dentro de Spring
	 */
	@Autowired
	private EstadoRepositorio estadoRepositorio;
	
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
	
	@Override
	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return estadoRepositorio.findAll();
	}
	
	public List<Estado>findAllByCountry(Long id){
		List <Estado> estadosRespuesta = new ArrayList<Estado>();
		List <Estado> estados = estadoRepositorio.findAll();
		for (Estado estado : estados) {
			if(estado.getPais().getId()==id)
				estadosRespuesta.add(estado);
		}
		return estadosRespuesta;
	}
	
	@Override
	public List<Estado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return estadoRepositorio.findAll(sort);
	}

	@Override
	public List<Estado> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Estado> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Estado> entities) {
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
	public Estado getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado getById(Long id) {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Estado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> S save(S entity) {
		return estadoRepositorio.save(entity);
	}

	@Override
	public Optional<Estado> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Estado entity) {
		estadoRepositorio.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Estado> entities) {
		estadoRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		estadoRepositorio.deleteAll();
		
	}

	@Override
	public <S extends Estado> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
		return estadoRepositorio.findAll(example, pageable);
	}

	@Override
	public <S extends Estado> long count(Example<S> example) {
		return estadoRepositorio.count(example);
	}

	@Override
	public <S extends Estado> boolean exists(Example<S> example) {
		return estadoRepositorio.exists(example);
	}

}
