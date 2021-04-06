package com.vopt.leaverequest.model;

import com.vopt.leaverequest.utils.Constants;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="users_roles")
    @Column(nullable = false, updatable = false)
    public Long roleId;
    public String roleName;
    public boolean isActive;

    public Roles() {
    }

    public Roles(Long roleId, String roleName, boolean isActive) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.isActive = isActive;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
