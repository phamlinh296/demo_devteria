package com.example.demo.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
//class lưu cc gtri truyền vào
@Getter
@Setter
public class UserCreationRequest {
//    @Size(min=3, message = "username  must have at least 3 characters")
    @Size(min=3, message = "USERNAME_INVALID")//phải để "" này giống error code ko, để như trên đc ko? YEP, phải để trùng tên enum, khác là lỗi.
    private String username;

//    @Size(min=8, message = "pw must have at least 8 characters")
    @Size(min=8, message = "INVALID_PASSWORD")//nếu hằng này viet sai + xra TH invalid pass (pass< 8 kí tự) thì mới gọi đến INVALID_KEY
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }
}
