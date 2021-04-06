package com.vopt.leaverequest.resource;

import com.vopt.leaverequest.model.Roles;
import com.vopt.leaverequest.model.Users;
import com.vopt.leaverequest.service.RolesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/roles")
public class RolesResource {
    private final RolesService rolesService;

    public RolesResource(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Roles>> getAllRoles () {
        List<Roles> roles = rolesService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @PostMapping("/addRole")
    public ResponseEntity<Roles> addRole(Roles role) {
        Roles roles = rolesService.addRole(role);
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
}
