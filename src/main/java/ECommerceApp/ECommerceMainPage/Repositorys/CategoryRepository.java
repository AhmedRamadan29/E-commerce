package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.Categories;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Integer> {
}
