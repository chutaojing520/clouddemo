package com.xiaowu.clouddemo.common.dto;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-12:13:24
 * @see
 * @since 1.0
 */
public class CommonResult<T> {
    //状态代码
    private int code;
    //状态信息
    private String message;
    //实际数据
    private T data;
    
    public CommonResult() {
        this(200, "成功", null);
    }
    
    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public CommonResult(int code, String message) {
        this(code, message, null);
    }
    
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
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
