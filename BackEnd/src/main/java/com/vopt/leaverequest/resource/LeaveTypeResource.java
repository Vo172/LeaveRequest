package com.vopt.leaverequest.resource;

import com.vopt.leaverequest.model.LeaveType;
import com.vopt.leaverequest.service.LeaveTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leavetype")
public class LeaveTypeResource {
    private final LeaveTypeService leaveTypeService;

    public LeaveTypeResource(LeaveTypeService leaveTypeService) {
        this.leaveTypeService = leaveTypeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<LeaveType>> getAllLeaveType () {
        List<LeaveType> employees = leaveTypeService.findAllLeaveType();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<LeaveType> addEmployee(@RequestBody LeaveType leaveType) {
        LeaveType newLeaveType = leaveTypeService.addLeaveType(leaveType);
        return new ResponseEntity<>(newLeaveType, HttpStatus.CREATED);
    }
}
