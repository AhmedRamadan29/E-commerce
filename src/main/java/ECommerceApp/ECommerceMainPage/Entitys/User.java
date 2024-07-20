package ECommerceApp.ECommerceMainPage.Entitys;

import ECommerceApp.ECommerceMainPage.Enums.Locale;
import ECommerceApp.ECommerceMainPage.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "users" ,schema = "u374042800_ecommerce")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String slug;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    private String avatar;

    private String email;

    private LocalDateTime emailValidated;

    private String phone;

    private LocalDateTime phoneValidated;

    @Column(columnDefinition = "text")
    private String bio;

    private String company;

    @Enumerated(EnumType.STRING)
    private Locale locale;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private LocalDateTime lastLogin;



    // Getters and setters...
}