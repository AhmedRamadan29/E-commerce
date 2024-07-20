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
    @Column(name = "card_id")
    private Integer cardId;
    @Column(name = "card_key")
    private String cardKey;
    @Column(name = "price")
    private Integer price;
    @Column(name = "creation_time_date")
    private LocalDateTime creationTimeDate;
}