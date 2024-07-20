package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "User2" ,schema = "u374042800_ecommerce")
public class User2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    @Column(name = "Passwerd")
    private String password;


}