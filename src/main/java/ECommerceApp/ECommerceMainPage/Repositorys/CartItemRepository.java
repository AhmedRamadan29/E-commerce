package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.CartItem;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}