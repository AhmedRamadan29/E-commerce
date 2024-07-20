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
    @Column(name = "id")
    private Integer id;
    @Column(name = "provider_id")
    private String providerId;
    @Column(name = "provider_key")
    private String providerKey;
    @Column(name = "hasher")
    @Enumerated(EnumType.STRING)
    private Hasher hasher;
    @Column(name = "password_hash")
    private String passwordHash;
    @Column(name = "password_salt")
    private String passwordSalt;
    @Column(name = "user_id")
    private Long userId;

}