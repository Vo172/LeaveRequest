package com.vopt.leaverequest.service;

import com.vopt.leaverequest.model.LeaveType;
import com.vopt.leaverequest.repo.LeaveTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LeaveTypeService {
    private final LeaveTypeRepo leaveTypeRepo;

    @Autowired
    public LeaveTypeService(LeaveTypeRepo leaveTypeRepo) {
        this.leaveTypeRepo = leaveTypeRepo;
    }
    public LeaveType addLeaveType(LeaveType leaveType) {
        return leaveTypeRepo.save(leaveType);
    }
    public List<LeaveType> findAllLeaveType() {
        return leaveTypeRepo.findAll();
    }
    public void deleteLeaveType(Long id){
        leaveTypeRepo.deleteById(id);
    }
}
