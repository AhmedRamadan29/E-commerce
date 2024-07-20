package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category_tags" , schema = "u374042800_ecommerce")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private long categoryId;

    @Column(nullable = false)
    private String tag;

}
