package ECommerceApp.ECommerceMainPage.Mappers;

import ECommerceApp.ECommerceMainPage.DTOs.ApplicationParameterDTO;

public abstract class ApplicationParametersMapper {
    public static ApplicationParameterDTO applicationParameterDTO(String name)
    {
        return ApplicationParameterDTO
                .builder().parameterName(name)
                .build();
    }
}
