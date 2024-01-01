package com.pagepal.webapi.controllers;

import com.pagepal.application.dtos.role.CreateRoleDto;
import com.pagepal.application.dtos.role.RoleDto;
import com.pagepal.application.dtos.role.UpdateRoleDto;
import com.pagepal.application.services.RoleService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @QueryMapping
    public List<RoleDto> getRoles() {
        return roleService.getRoles();
    }

    @QueryMapping
    public RoleDto getRoleById(@Argument String id) {
        return roleService.getById(id);
    }

    @MutationMapping(name = "createRole")
    public RoleDto createRole(@Argument(name = "createRole") CreateRoleDto createRoleDto) {
        return roleService.create(createRoleDto);
    }

    @MutationMapping(name = "updateRole")
    public RoleDto updateRole(@Argument(name = "updateRole") String id, @Argument UpdateRoleDto updateRoleDto) {
        return roleService.update(id, updateRoleDto);
    }

    @MutationMapping(name = "deleteRole")
    public RoleDto deleteRole(@Argument String id) {
        return roleService.delete(id);
    }
}
