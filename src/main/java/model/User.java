package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="USR_ID")
    private int usrId;
    @Column(name="USR_FIRSTNAME")
    private String usrFirstname;
    @Column(name="USR_LASTNAME")
    private String usrLastName;
    @Column(name="USR_PASSWORD")
    private String usrPassword;
    @Column(name="USR_EMAIL")
    private String usrEmail;
    @Column( name = "USR_BIRTH_DATE")
    private LocalDateTime birthDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USR_ADD_ID", referencedColumnName = "ADD_ID")
    private Address address;


}
