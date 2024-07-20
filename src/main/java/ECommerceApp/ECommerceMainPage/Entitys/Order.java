package ECommerceApp.ECommerceMainPage.Entitys;

import ECommerceApp.ECommerceMainPage.Enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders" ,schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrderStatus orderStatus;
    @Column(name = "total_amount")
    private double totalAmount;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "payment_method")
    private String paymentMethod;
}