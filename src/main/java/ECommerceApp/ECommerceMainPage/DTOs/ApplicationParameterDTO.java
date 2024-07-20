package ECommerceApp.ECommerceMainPage.DTOs;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Builder
public class ApplicationParameterDTO {
    private int parameterId;
    private String parameterName;
    private String parameterValue;
    private Integer parameterOrder;
    private String parameterDescription;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
