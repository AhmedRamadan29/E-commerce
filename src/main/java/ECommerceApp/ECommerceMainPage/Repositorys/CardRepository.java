package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}