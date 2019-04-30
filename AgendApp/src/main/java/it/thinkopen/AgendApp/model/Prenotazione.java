package it.thinkopen.AgendApp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prenotazione {
	
	@Id
	private Long id;
	
	@ManyToOne
	private Utente utente;
	//
	@ManyToOne
	private Sala sala;
	
}
