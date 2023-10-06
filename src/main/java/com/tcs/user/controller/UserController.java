package com.tcs.user.controller;

import com.tcs.user.clients.OrderClient;
import com.tcs.user.entity.User;
import com.tcs.user.model.Order;
import com.tcs.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    OrderClient orderClient;

    @Autowired
    IUserService userService;
    @GetMapping
    public List<User> getUsers (){
        return userService.getUsers();
    }
    @GetMapping("/{id}")
    public User getUsers (@PathVariable Long id){
        return userService.getUser(id);
    }
    @PostMapping
    public User saveUser (@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/orders/{userId}")
    public List<Order> getOrderByUserId (@PathVariable Long userId){
       return orderClient.getOrderByUserId(userId);
    }
}
