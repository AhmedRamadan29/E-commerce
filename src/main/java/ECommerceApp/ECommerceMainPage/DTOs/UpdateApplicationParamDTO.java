package ECommerceApp.ECommerceMainPage.DTOs;

import lombok.Data;

@Data
public class UpdateApplicationParamDTO {
    private Integer parameterId;
    private String parameterName;
    private String parameterValue;
    private Integer parameterOrder;
    private String parameterDescription;
}
