package com.example.demo.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USER_EXISTED(1002,"User exited"),
    USERNAME_INVALID(1003, "Username must be at least {min} characters"),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters"),
    INVALID_KEY(1001, "key enum trong userCreationRequest ko nằm trong enum đã kbao"),//kiểu hằng này k nằm trong enum đã kbao
    ;//nhớ ;
    private int code;
    private String message;
    //cons
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    //get
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
