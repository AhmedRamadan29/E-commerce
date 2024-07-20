package ECommerceApp.ECommerceMainPage.Repositorys;
import ECommerceApp.ECommerceMainPage.DTOs.ApplicationParameterDTO;
import ECommerceApp.ECommerceMainPage.Entitys.ApplicationParameters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationParameterRepository extends JpaRepository<ApplicationParameters, Integer> {

    @Query(value = "SELECT DISTINCT parameter_name FROM u374042800_ecommerce.application_parameters",nativeQuery = true)
    public List<String> getDistinctName();

    Optional<ApplicationParameters> findByParameterName(String name);
}