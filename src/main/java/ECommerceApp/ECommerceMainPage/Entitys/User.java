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
    @Column(name = "id")
    private Integer id;
    @Column(name = "slug")
    private String slug;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "email")
    private String email;
    @Column(name = "email_validated")
    private LocalDateTime emailValidated;
    @Column(name = "phone")
    private String phone;
    @Column(name = "phone_validated")
    private LocalDateTime phoneValidated;
    @Column(name = "bio")
    private String bio;
    @Column(name = "company")
    private String company;
    @Column(name = "locale")
    @Enumerated(EnumType.STRING)
    private Locale locale;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "last_login")
    private LocalDateTime lastLogin;
}