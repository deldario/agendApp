package it.thinkopen.AgendApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.thinkopen.AgendApp.model.Sala;

@RepositoryRestResource
public interface SalaRepository extends CrudRepository<Sala, Long>{


}
