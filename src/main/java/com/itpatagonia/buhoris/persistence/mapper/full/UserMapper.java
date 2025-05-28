package com.itpatagonia.buhoris.persistence.mapper.full;

import com.itpatagonia.buhoris.domain.dto.full.UsuarioDTO;
import com.itpatagonia.buhoris.persistence.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = { RoleMapper.class })
public interface UserMapper {

    @Mappings({
            @Mapping(source = "firstName",        target = "nombre"),
            @Mapping(source = "lastName",         target = "apellido"),
            @Mapping(source = "birthDate",        target = "fechaNacimiento"),
            @Mapping(source = "address",          target = "direccion"),
            @Mapping(source = "email",            target = "correoElectronico"),
            @Mapping(source = "role",             target = "rol")
    })
    UsuarioDTO toDto(User user);
}

