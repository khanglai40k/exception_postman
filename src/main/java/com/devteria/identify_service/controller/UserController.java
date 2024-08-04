package com.devteria.identify_service.controller;

import com.devteria.identify_service.dto.request.ApiResponse;
import com.devteria.identify_service.dto.request.UserCreationRequest;
import com.devteria.identify_service.dto.request.UserUpdateRequest;
import com.devteria.identify_service.entity.User;
import com.devteria.identify_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//xử lý route api
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
       return apiResponse;
    }
// request body  bắt buọc khi thêm mới hay sửa
    @GetMapping
   public List<User> getUsers(){  //List là một interface trong Java Collections Framework đại diện cho một tập hợp có thể có thứ tự các phần tử.
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);

    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable("userId") String userId,@RequestBody UserUpdateRequest request){
        return userService.updateUser(userId , request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User has been delete";

    }

}
