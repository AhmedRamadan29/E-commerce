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
    private Integer id;

    private Long userId;

    @Enumerated(EnumType.STRING)
    private Platform platform;

    private String platformUser;

    @Column(name = "created_at")
    private LocalDateTime createdAt;



}