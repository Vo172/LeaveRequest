package com.vopt.leaverequest.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="users_seq")
    @Column(nullable = false, updatable = false)
    public Long userId;
    public String userName;
    public String fullName;
    public String password;
    public String email;
    public boolean isActive;


    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với Person ở phía dưới
    @JoinColumn(name = "roleId") // Liên kết với nhau qua khóa ngoại person_id
    private Roles roles;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<LeaveRequest> leaveRequests;

    public Users() {
    }

    public Users(Long userId, String userName, String fullName, String password, String email, boolean isActive) {
        this.userId = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.isActive = isActive;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
