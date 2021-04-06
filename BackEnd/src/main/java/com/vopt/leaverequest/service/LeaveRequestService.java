package com.vopt.leaverequest.service;

import com.vopt.leaverequest.repo.LeaveRequestRepo;

public class LeaveRequestService {
    private final LeaveRequestRepo leaveRequestRepo;

    public LeaveRequestService(LeaveRequestRepo leaveRequestRepo) {
        this.leaveRequestRepo = leaveRequestRepo;
    }
}
