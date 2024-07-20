package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "application_parameters",schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ApplicationParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parameter_id")
    private Integer parameteriId;
    @Column(name = "parameter_name")
    private String parameterName;
    @Column(name = "parameter_value")
    private String parameterValue;
    @Column(name = "parameter_description")
    private String parameterDescription;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;
    @Column(name = "parameter_order")
    private Integer parameterOrder;
}
