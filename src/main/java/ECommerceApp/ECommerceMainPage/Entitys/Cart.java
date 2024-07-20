package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "carts",schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Snippet.Status status;
    @Column(name = "created_at", nullable = true, updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "created_by")
    private Long createdBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
