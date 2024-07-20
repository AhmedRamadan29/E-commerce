package ECommerceApp.ECommerceMainPage.Repositorys;
import ECommerceApp.ECommerceMainPage.Entitys.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialProfileRepository extends JpaRepository<SocialProfile, Integer> {
}