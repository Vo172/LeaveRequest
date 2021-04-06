package com.vopt.leaverequest.service;

import com.vopt.leaverequest.model.Users;
import com.vopt.leaverequest.repo.UsersRepo;
import com.vopt.leaverequest.utils.MD5;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static com.vopt.leaverequest.utils.MD5.getMd5;

@Service
@Transactional
public class UsersService {
    private final UsersRepo usersRepo;

    public UsersService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public Users addUsers(Users user) {
        String encryptGetMd5 = getMd5(user.userName.trim() + user.password.trim());
        user.setPassword(encryptGetMd5);
        return usersRepo.save(user);
    }
    public Users updateUser(Users user){
        return usersRepo.save(user);
    }
    public List<Users> findAllUsers() {
        return usersRepo.findAll();
    }
    public void deleteUserById(Long id){
        usersRepo.deleteById(id);
    }
    public Optional<Users> getUserById(Long id){
        return usersRepo.findById(id);
    }
}
