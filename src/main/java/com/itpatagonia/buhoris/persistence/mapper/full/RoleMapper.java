package com.itpatagonia.buhoris.persistence.mapper.full;


import com.itpatagonia.buhoris.domain.dto.full.RolDTO;
import com.itpatagonia.buhoris.persistence.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(source = "name", target = "nombre")
    RolDTO toDto(Role role);
}

