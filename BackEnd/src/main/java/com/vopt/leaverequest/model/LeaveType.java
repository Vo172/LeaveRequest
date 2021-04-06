package com.vopt.leaverequest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class LeaveType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="leavetype_seq")
    @Column(nullable = false, updatable = false)
    public Long leaveTypeId;
    public String typeName;
    public boolean isActive;

    public LeaveType() {
    }

    public LeaveType(Long leaveTypeId, String typeName, boolean isActive) {
        this.leaveTypeId = leaveTypeId;
        this.typeName = typeName;
        this.isActive = isActive;
    }

    public Long getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(Long leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
