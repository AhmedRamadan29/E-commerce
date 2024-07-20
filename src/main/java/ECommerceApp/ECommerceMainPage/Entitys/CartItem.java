package ECommerceApp.ECommerceMainPage.Entitys;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart_items",schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    private Long productId;

    private double price;

    private Integer quantity;

    @Column(name = "created_at", nullable = true, updatable = false)
    private LocalDateTime createdAt;

}

