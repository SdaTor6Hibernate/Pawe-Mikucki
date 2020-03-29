package model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID")
    private int CountryId;
    @Column(name= "CO_NAME")
    private String name;
    @Column(name ="CO_ALIAS")
    private String alias;


}
