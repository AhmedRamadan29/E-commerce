package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
@Entity
@Table(name = "ecommerce_info" ,schema = "u374042800_ecommerce")
public class EcommerceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String image;

    @Column(columnDefinition = "text")
    private String description;

    private String title;

    private String name;

    private String phoneNumber;

    private double discount;

    // Getters and setters...
}
