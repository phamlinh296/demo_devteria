package com.example.demo.exception;

public class AppException extends RuntimeException{
    private ErrorCode errorCode;


    public AppException(ErrorCode errorCode) {//chỗ này có tham số
        super(errorCode.getMessage());//vì lỗi này lưu vào cons của cha, cha truyền sang con
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
