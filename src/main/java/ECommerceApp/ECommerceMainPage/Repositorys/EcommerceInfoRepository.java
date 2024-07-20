package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.EcommerceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcommerceInfoRepository extends JpaRepository<EcommerceInfo, Integer> {
}