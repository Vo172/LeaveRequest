package com.vopt.leaverequest.service;

import com.vopt.leaverequest.model.Roles;
import com.vopt.leaverequest.model.Users;
import com.vopt.leaverequest.repo.RolesRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RolesService {
    private final RolesRepo rolesRepo;

    public RolesService(RolesRepo rolesRepo) {
        this.rolesRepo = rolesRepo;
    }

    public List<Roles> getAllRoles() {
        return rolesRepo.findAll();
    }

    public Roles addRole(Roles roles){
        return rolesRepo.save(roles);
    }

    public Roles updateRole(Roles roles){
        return rolesRepo.save(roles);
    }


}
