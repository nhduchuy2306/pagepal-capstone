package com.pagepal.application.services;

import com.pagepal.application.dtos.role.CreateRoleDto;
import com.pagepal.application.dtos.role.RoleDto;
import com.pagepal.application.dtos.role.UpdateRoleDto;

import java.util.List;

public interface RoleService {
    List<RoleDto> getRoles();
    RoleDto getById(String id);
    RoleDto create(CreateRoleDto createRoleDto);
    RoleDto update(String id, UpdateRoleDto updateRoleDto);
    RoleDto delete(String id);
}
