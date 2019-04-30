package it.thinkopen.AgendApp.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Sala sala;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date oraInizio;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date oraFine;
	
}
