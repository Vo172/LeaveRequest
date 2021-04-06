package com.vopt.leaverequest.repo;

import com.vopt.leaverequest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
