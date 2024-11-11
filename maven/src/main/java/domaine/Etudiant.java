package domaine;

import javax.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "ETUDIANT")
public class Etudiant {


      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "ID")
      private Integer Id;


      private String name;
      
      @ManyToOne 
      @JoinColumn(name = "filiere_id") 
      private Filiere filiere;  
}
