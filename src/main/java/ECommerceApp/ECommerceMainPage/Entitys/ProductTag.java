package ECommerceApp.ECommerceMainPage.Entitys;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "product_tags" ,schema = "u374042800_ecommerce")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    @Column(name = "tag")
    private String tag;


}