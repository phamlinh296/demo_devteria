package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

//chứa all fill để chuẩn hóa cho api của mình
//class: response api chuẩn
@JsonInclude(JsonInclude.Include.NON_NULL) //thêm chỉ để nếu cái fill nào null thì ko in ra, chỉ in cái ko null
public class ApiResponse<T>{//cách viết k cần cố định kiểu dl trả về
    private int code=1000;
    private String message;
    private T result;// kiểu trả về thay đổi tùy vào từng api, nên đặt là T


    //sao chỉ là 1 class bthg mà dùng postman n lại ra cấu trúc theo thứ tự thuộc tính à
    //kiểu postman n dựa vào đâu mà lại coi cái này là 1 apiresponse?
    //à vì là trả về kquar dạng class<obj> thì nó sẽ theo dạng list từng thuộc tính?
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

//1. Tại sao không cần toString() mà vẫn trả về được đối tượng?
//việc trả về đối tượng dạng JSON ko phụ thuộc vào việc ĐN phương thức toString().
// Đây là nhờ vào cơ chế serialization (tuần tự hóa) của các thư viện như Jackson
// mà Spring Boot sd để tự động chuyển đổi các đối tượng Java thành JSON.

//Khi Spring Boot xử lý một đối tượng ApiResponse, Jackson sẽ dựa vào các getter để tạo JSON: