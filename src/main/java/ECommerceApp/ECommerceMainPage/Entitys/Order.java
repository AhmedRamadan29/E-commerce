package ECommerceApp.ECommerceMainPage.Entitys;

import ECommerceApp.ECommerceMainPage.Enums.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders" ,schema = "u374042800_ecommerce")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private double totalAmount;

    private String shippingAddress;

    private String paymentMethod;



    // Getters and setters...
}