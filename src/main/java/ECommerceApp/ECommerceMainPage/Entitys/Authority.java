package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorities" , schema = "u374042800_ecommerce")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false, length = 50,name = "username")
    private String username;
    @Column(nullable = false, length = 50,name = "authority")
    private String authority;


}