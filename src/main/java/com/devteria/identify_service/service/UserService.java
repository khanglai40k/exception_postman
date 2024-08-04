package com.devteria.identify_service.service;

import com.devteria.identify_service.dto.request.UserCreationRequest;
import com.devteria.identify_service.dto.request.UserUpdateRequest;
import com.devteria.identify_service.entity.User;
import com.devteria.identify_service.exception.AppException;
import com.devteria.identify_service.exception.ErrorCode;
import com.devteria.identify_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// xử lý các logic
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User createUser(UserCreationRequest request){
        if (userRepository.existsByUserName(request.getUserName())) {
            // If the user already exists, throw an exception
            throw new AppException(ErrorCode.USER_EXISTED);
        }
        User user = new User();  //tạo 1 user mới


        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());  //set get để thiết lập value
        return userRepository.save(user);  // chỗ interface ệ nha ( luuw mới user)
    }

//    lấy user
    public List<User> getUsers(){  // trả về kiểu list
        return userRepository.findAll();
    }

//    lấy user theo id
    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found")
        );  //  nếu mà ko có user thì báo user not found

    }

//    update

    public User updateUser(String userId ,UserUpdateRequest request){
        User user = getUser(userId);   // method getuser trong bảng User (enity)
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());  //set get để thiết lập value
        return userRepository.save(user);

    }

    public void deleteUser(String userId ){
            userRepository.deleteById(userId);
    }

}
