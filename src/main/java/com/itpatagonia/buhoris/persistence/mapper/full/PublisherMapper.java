package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.EditorialDTO;
import com.itpatagonia.buhoris.persistence.model.Publisher;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface PublisherMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "country", target = "pais"),
            @Mapping(source = "website", target = "sitioWeb"),
            @Mapping(source = "foundedDate", target = "fechaFundacion"),
            @Mapping(source = "isActive", target = "activo")
    })
    EditorialDTO toDTO(Publisher publisher);
    Set<EditorialDTO> toList(Set<Publisher> publishers);

    @InheritInverseConfiguration
    Publisher toEntity(EditorialDTO editorial);

}
