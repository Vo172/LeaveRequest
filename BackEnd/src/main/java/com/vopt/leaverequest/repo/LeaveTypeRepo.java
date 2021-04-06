package com.vopt.leaverequest.repo;

import com.vopt.leaverequest.model.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepo extends JpaRepository<LeaveType, Long> {
}
