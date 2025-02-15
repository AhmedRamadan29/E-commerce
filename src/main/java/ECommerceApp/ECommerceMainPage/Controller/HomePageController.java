package ECommerceApp.ECommerceMainPage.Controller;
import ECommerceApp.ECommerceMainPage.DTOs.CrudApplicationParamDto;
import ECommerceApp.ECommerceMainPage.DTOs.brandsDTO;
import ECommerceApp.ECommerceMainPage.Repositorys.BrandJoinApplicationParametersRepository;
import ECommerceApp.ECommerceMainPage.Services.ApplicationParamsService;
import ECommerceApp.ECommerceMainPage.Services.BrandService;
import ECommerceApp.GlobalEnums.ResponseMessage;
import ECommerceApp.Model.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/homePage")
public class HomePageController {
    @Autowired
    private ApplicationParamsService applicationParamsService;

    @Autowired
    BrandService brandService;
    @GetMapping("/getDistinctNameParam")
    public ResponseEntity<?> GetDistinctNameParam() {
        return ResponseEntity.ok(new Response(200,
                ResponseMessage.Succesful_Request.getMessage(),
                ResponseMessage.Developer_Message.getMessageByApi("getDistinctNameParam"),
                applicationParamsService.getDistinctNameParams()));
    }
    @GetMapping("/getByParamName")
    public ResponseEntity<?> GetByParamName(@RequestParam String paramName) {
        return ResponseEntity.ok(new Response(200,
                ResponseMessage.Succesful_Request.getMessage(),
                ResponseMessage.Developer_Message.getMessageByApi("getByParamName"),
                applicationParamsService.getByParamName(paramName)));
    }
    @PostMapping("/addParam")
    public ResponseEntity<?> AddParam(@RequestBody CrudApplicationParamDto crudApplicationParamDto) {
        return ResponseEntity.ok(new Response(200,
                ResponseMessage.Succesful_Request.getMessage(),
                ResponseMessage.Developer_Message.getMessageByApi("getByParamName"),
                applicationParamsService.crudAppParamsOperation(crudApplicationParamDto)));
    }

    @GetMapping ("/brands")
    public ResponseEntity <List<brandsDTO>> getAll(){

        return  ResponseEntity.ok(brandService.getAllbrand());

    }
    @GetMapping("/BrandAndApplicationBarameters")
    public ResponseEntity<List<BrandJoinApplicationParametersRepository>> getMainPageBrands() {
        List<BrandJoinApplicationParametersRepository> brands = brandService.getMainPageBrands();
        return ResponseEntity.ok(brands);
    }

}
