package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "application_parameters",schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApplicationParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parameter_id")
    private Integer parameter_id;
    @Column(name = "parameter_name")
    private String parameter_name;
    @Column(name = "parameter_value")
    private String parameter_value;
    @Column(name = "parameter_description")
    private String parameter_description;
    @Column(name = "created_at")
    private LocalDate created_at;
    @Column(name="updated_at")
    private LocalDate updated_at;
    @Column(name = "parameter_order")
    private Integer parameter_order;
}
