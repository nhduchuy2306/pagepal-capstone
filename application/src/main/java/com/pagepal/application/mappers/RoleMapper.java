package com.pagepal.application.mappers;

import com.pagepal.application.dtos.role.CreateRoleDto;
import com.pagepal.application.dtos.role.RoleDto;
import com.pagepal.application.dtos.role.UpdateRoleDto;
import com.pagepal.domain.entities.postgre.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "status", source = "status")
    RoleDto toDto(Role role);
    Role toEntity(CreateRoleDto createRoleDto);
    Role toEntity(UpdateRoleDto updateRoleDto);
}
