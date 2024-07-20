package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table (name = "brands")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false,name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(unique = true,name = "slug")
    private String slug;
    @Column(nullable = false,name = "visibility")
    private Boolean visibility = true;
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
