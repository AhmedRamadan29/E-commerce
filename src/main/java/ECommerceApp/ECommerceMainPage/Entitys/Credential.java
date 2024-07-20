package ECommerceApp.ECommerceMainPage.Entitys;
import ECommerceApp.ECommerceMainPage.Enums.Hasher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "credentials" ,schema = "u374042800_ecommerce")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String providerId;
    private String providerKey;
    @Enumerated(EnumType.STRING)
    private Hasher hasher;
    private String passwordHash;
    private String passwordSalt;
    private Long userId;

}