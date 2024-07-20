package ECommerceApp.ECommerceMainPage.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "card",schema = "u374042800_ecommerce")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer cardId;

    private String cardKey;

    private Integer price;

    @Column(name = "creation_time_date")
    private LocalDateTime creationTimeDate;

}