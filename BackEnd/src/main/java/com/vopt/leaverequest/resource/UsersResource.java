package com.vopt.leaverequest.resource;

import com.vopt.leaverequest.model.LeaveType;
import com.vopt.leaverequest.model.Users;
import com.vopt.leaverequest.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/users")
public class UsersResource {
    private final UsersService usersService;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllLeaveType () {
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Users> addUser(@RequestBody Users users) {
        Users newUser = usersService.addUsers(users);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PostMapping("/updateUser")
    public ResponseEntity<Users> updateUser(@RequestBody Users users) {
        Users newUser = usersService.updateUser(users);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
