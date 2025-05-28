package com.itpatagonia.buhoris.persistence.mapper.summary;


import com.itpatagonia.buhoris.domain.dto.full.UsuarioDTO;
import com.itpatagonia.buhoris.domain.dto.summary.UsuarioSummaryDTO;
import com.itpatagonia.buhoris.persistence.mapper.full.RoleMapper;
import com.itpatagonia.buhoris.persistence.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = { RoleMapper.class })
public interface UserSummaryMapper {

    @Mappings({
            @Mapping(source = "firstName",        target = "nombre"),
            @Mapping(source = "lastName",         target = "apellido"),
            @Mapping(source = "role",             target = "rol")
    })
    UsuarioSummaryDTO toDto(User user);
}

