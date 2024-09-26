package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//lớp này viết chỉ để lay pthuc cho user dùng luôn
@Repository
public interface UserRepository extends JpaRepository<User,String > {

    boolean existsByUsername(String userName);//them 1 pthuc
    //nma sao chưa override thân mà cx bt là so sánh gtri dlieu request với data đã có nhỉ
    //à cái repo này chính là chiếu đến đám data rồi.?
}
