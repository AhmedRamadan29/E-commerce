package ECommerceApp.ECommerceMainPage.Repositorys;
import ECommerceApp.ECommerceMainPage.Entitys.ApplicationParameters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationParameterRepository extends JpaRepository<ApplicationParameters, Integer> {
}