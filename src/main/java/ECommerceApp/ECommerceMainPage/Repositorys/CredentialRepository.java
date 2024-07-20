package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Integer> {
}