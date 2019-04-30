package it.thinkopen.AgendApp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prenotazione {
	
	@Id
	private long id;
	
}
