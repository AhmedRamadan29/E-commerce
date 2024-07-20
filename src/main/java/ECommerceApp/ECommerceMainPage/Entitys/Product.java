package ECommerceApp.ECommerceMainPage.Entitys;


import ECommerceApp.ECommerceMainPage.Enums.DiscountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "products",schema = "u374042800_ecommerce")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "title")
    private String title;
    @Column(name = "picture")
    private String picture;
    @Column(name = "summary")
    private String summary;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Enumerated(EnumType.STRING)
    @Column(name = "discount_type")
    private DiscountType discountType;
    @Column(name = "discount_value")
    private Double discountValue;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "reviewers_count")
    private int reviewersCount;
    @Column(name = "rating")
    private float rating;
    @Column(name = "Product_Brand")
    private Integer productBrand;
}