package ECommerceApp.ECommerceMainPage.Services;

import ECommerceApp.ECommerceMainPage.DTOs.brandsDTO;
import ECommerceApp.ECommerceMainPage.Mappers.brandMapper;
import ECommerceApp.ECommerceMainPage.Repositorys.brandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class brandService {
    @Autowired
  private brandsRepository brandsRepository;




    public List<brandsDTO> getAllbrand(){


     return      brandsRepository.findAll().parallelStream().map(brandMapper::toDtoWithBuilder).collect(Collectors.toList());



    }


}
