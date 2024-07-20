package ECommerceApp.ECommerceMainPage.Services;
import ECommerceApp.ECommerceMainPage.DTOs.brandsDTO;
import ECommerceApp.ECommerceMainPage.Mappers.brandMapper;
import ECommerceApp.ECommerceMainPage.Repositorys.BrandJoinApplicationParametersRepository;
import ECommerceApp.ECommerceMainPage.Repositorys.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandService {
     final BrandsRepository brandsRepository;
    @Autowired
    public BrandService(BrandsRepository brandsRepository) {
        this.brandsRepository = brandsRepository;
    }

    public List<brandsDTO> getAllbrand(){
     return  brandsRepository.findAll().parallelStream().map(brandMapper::toDtoWithBuilder).collect(Collectors.toList());


    }
    public List<BrandJoinApplicationParametersRepository> getMainPageBrands() {
        return brandsRepository.findMainPageBrands();
    }

}
