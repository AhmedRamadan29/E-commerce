package ECommerceApp.ECommerceMainPage.Mappers;

import ECommerceApp.ECommerceMainPage.DTOs.ApplicationParameterDTO;

import java.util.Collections;
import java.util.List;


public class ApplicationParameterMapper {

    public static ApplicationParameterDTO toDTO(String parameterName) {
        return ApplicationParameterDTO.builder()
                .parameterName(parameterName)
                .build();
    }
}



