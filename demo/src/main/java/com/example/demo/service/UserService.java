package com.example.demo.service;

import com.example.demo.dto.UserCreationRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.AppException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;//truyền repo để sd pthuc crud luôn

    //1.tao dtg: excep là tổn tại rồi thì báo đã tồn tại
    public User createUser(UserCreationRequest request){
        User user= new User();

        if(userRepository.existsByUsername(request.getUsername()))
//            throw new RuntimeException("user existed");//nếu muốn tạo ngle tùy chỉnh thì vào appException
            throw new AppException(ErrorCode.USER_EXISTED);//ex tùy chỉnh
//            throw new RuntimeException("Uncategorized");

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());
        return userRepository.save(user);
    }
    //2. get theo id
    public User getUser(String userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));//chỉ in ra khi viết class exception
    }
    //3. update theo id
    public User updateUser(String userId, UserCreationRequest request){
        User user= getUser(userId);
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());
        return userRepository.save(user);
    }
    //4. xóa 1 người theo id
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
    //5. get list user
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
