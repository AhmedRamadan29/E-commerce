package ECommerceApp.ECommerceMainPage.Repositorys;

import ECommerceApp.ECommerceMainPage.Entitys.brands;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandsRepository extends JpaRepository<brands, Long> {
    @Query(value = "SELECT A.image AS image, A.slug AS slug FROM brands A JOIN application_parameters B ON (A.id = B.parameter_value AND B.parameter_name = 'main-page-brand')", nativeQuery = true)
    List<BrandJoinApplicationParametersRepository> findMainPageBrands();
}