package ECommerceApp.ECommerceMainPage.DTOs;


import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;


@Data
@Builder
public class brandsDTO {

    private Long id;


    private String name;

    private String image;


    private String slug;


    private Boolean visibility = true;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;
}
