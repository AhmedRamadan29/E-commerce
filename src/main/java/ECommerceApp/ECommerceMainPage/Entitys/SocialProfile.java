package ECommerceApp.ECommerceMainPage.Entitys;

import ECommerceApp.ECommerceMainPage.Enums.Platform;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "social_profiles" ,schema = "u374042800_ecommerce")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "userId")
    private Long userId;
    @Column(name = "platform")
    @Enumerated(EnumType.STRING)
    private Platform platform;
    @Column(name = "platformUser")
    private String platformUser;
    @Column(name = "created_at")
    private LocalDateTime createdAt;



}