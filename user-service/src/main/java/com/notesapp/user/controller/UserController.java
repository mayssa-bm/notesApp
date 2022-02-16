package com.notesapp.user.controller;

import com.notesapp.user.VO.ResponseTemplateVO;
import com.notesapp.user.entity.User;
import com.notesapp.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")

    private User saveUser(@RequestBody User user){
        log.info("Inside saveUser method in userController");
        return userService.saveUser(user);

    }
    //get user with a departmentId
    //we need to create a wrapper object
    @GetMapping("/{username}")
    public ResponseTemplateVO getUserWithNotebook(@PathVariable("username") String username){
        log.info("Inside ResponseTemplateVO method in userController");
        return userService.getUserWithNotebook(username);
    }
}
