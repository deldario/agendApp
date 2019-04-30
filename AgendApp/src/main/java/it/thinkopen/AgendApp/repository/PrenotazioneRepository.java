package it.thinkopen.AgendApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.thinkopen.AgendApp.model.Prenotazione;

@RepositoryRestResource
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long>{

}
