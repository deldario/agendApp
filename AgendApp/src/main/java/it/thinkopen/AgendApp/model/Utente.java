package it.thinkopen.AgendApp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Utente  {

    @Id
    private Long id;
    
    private String email;
    private String password;
}
