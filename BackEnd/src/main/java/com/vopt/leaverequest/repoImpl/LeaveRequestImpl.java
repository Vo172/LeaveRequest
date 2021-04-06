package com.vopt.leaverequest.repoImpl;

import com.vopt.leaverequest.model.LeaveRequest;
import com.vopt.leaverequest.repo.LeaveRequestRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public abstract class LeaveRequestImpl implements LeaveRequestRepo {
    private static final Logger LOGGER = LoggerFactory.getLogger(LeaveRequestImpl.class);
    private static final String TAG = "LeaveRequestImpl::";
    @Override
    public List<LeaveRequest> getLeaveRequestByUser(Long userId){
        try{
            String sql = " FROM ";
            return null;
        }catch (Exception e){
            LOGGER.error(TAG + "getLeaveRequestByUser::", e);
        }
        return null;
    }
}
