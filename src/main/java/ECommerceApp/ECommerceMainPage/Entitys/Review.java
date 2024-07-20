package ECommerceApp.ECommerceMainPage.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews" ,schema = "u374042800_ecommerce")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "rating")
    private int rating;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}