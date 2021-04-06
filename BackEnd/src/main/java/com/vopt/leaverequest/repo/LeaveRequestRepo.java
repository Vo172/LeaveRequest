package com.vopt.leaverequest.repo;

import com.vopt.leaverequest.model.LeaveRequest;
import com.vopt.leaverequest.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveRequestRepo extends JpaRepository<Roles, Long> {
    public List<LeaveRequest> getLeaveRequestByUser(Long userId);
}
