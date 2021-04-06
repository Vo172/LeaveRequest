package com.vopt.leaverequest.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class LeaveRequest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="leaverequest_seq")
    @Column(nullable = false, updatable = false)
    public Long leaveRequestId;
    public String reason;
    public Date leaveDate;
    public Date createDate;
    public Long status;
    public boolean isActive;

    @ManyToOne
    @JoinColumn(name = "userId") // thông qua khóa ngoại address_id
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Users users;

    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với Person ở phía dưới
    @JoinColumn(name = "leaveTypeId") // Liên kết với nhau qua khóa ngoại person_id
    private LeaveType leaveType;

    public LeaveRequest() {
    }

    public LeaveRequest(Long leaveRequestId, String reason, Date leaveDate, Date createDate, Long status, boolean isActive) {
        this.leaveRequestId = leaveRequestId;
        this.reason = reason;
        this.leaveDate = leaveDate;
        this.createDate = createDate;
        this.status = status;
        this.isActive = isActive;
    }

    public Long getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(Long leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
