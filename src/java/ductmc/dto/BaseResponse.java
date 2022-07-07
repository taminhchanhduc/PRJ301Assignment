/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dto;

/**
 *
 * @author Peter
 */
public class BaseResponse {
    private Integer status;
    private String message;
    private Object data;

    public BaseResponse() {
        this.status = -1;
        this.message = "Lỗi";
    }

    public BaseResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
