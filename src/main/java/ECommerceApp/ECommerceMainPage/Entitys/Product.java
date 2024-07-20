package ECommerceApp.ECommerceMainPage.Entitys;


import ECommerceApp.ECommerceMainPage.Enums.DiscountType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "products",schema = "u374042800_ecommerce")
@Data
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    private String title;

    private String picture;

    @Column(columnDefinition = "text")
    private String summary;

    @Column(columnDefinition = "text")
    private String description;

    @Column(nullable = false)
    private double price;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

    private Double discountValue;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private int reviewersCount;

    @Column(nullable = false)
    private float rating;



}