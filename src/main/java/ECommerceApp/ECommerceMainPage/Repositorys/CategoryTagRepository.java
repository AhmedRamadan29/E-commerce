package ECommerceApp.ECommerceMainPage.Repositorys;
import ECommerceApp.ECommerceMainPage.Entitys.CategoryTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTagRepository extends JpaRepository<CategoryTag, Integer> {
}