package provider.beeline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue( strategy = IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "balance")
    private Double balance;

}
