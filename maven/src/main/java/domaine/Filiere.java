package domaine;


import java.util.Set;
import javax.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "FILIERE")
public class Filiere { 


	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "idfiliere")
	  private Integer idfiliere;
	  
	  @OneToMany(mappedBy = "filiere", cascade = CascadeType.ALL)
	  private Set<Etudiant> etudiant;




      private String nom;
     
      
}
