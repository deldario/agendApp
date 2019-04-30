
package it.thinkopen.AgendApp.model;
import javax.persistence.*;
import lombok.Data;


@Entity
@Data
public class Sala {
    @Id
    private Long id;    
    private String nome;    
}
