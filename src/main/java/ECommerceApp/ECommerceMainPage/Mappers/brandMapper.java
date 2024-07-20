package ECommerceApp.ECommerceMainPage.Mappers;

import ECommerceApp.ECommerceMainPage.DTOs.brandsDTO;
import ECommerceApp.ECommerceMainPage.Entitys.brands;

public abstract class brandMapper {
    brandsDTO toDtoWithBuilder(brands entity) {
        return brandsDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .image(entity.getImage())
                .slug(entity.getSlug())
                .visibility(entity.getVisibility())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    brands toEntityWithBuilder(brands dto) {
        return brands.builder()
                .id(dto.getId())
                .name(dto.getName())
                .image(dto.getImage())
                .slug(dto.getSlug())
                .visibility(dto.getVisibility())
                .createdAt(dto.getCreatedAt())
                .updatedAt(dto.getUpdatedAt())
                .build();
    }
}
