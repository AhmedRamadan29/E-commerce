package ECommerceApp.ECommerceMainPage.DTOs;

import lombok.Data;

@Data
public class InsertApplicationParamDTO {
    private String parameterName;
    private String parameterValue;
    private Integer parameterOrder;
}
