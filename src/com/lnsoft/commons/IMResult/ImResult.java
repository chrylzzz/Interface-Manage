package com.lnsoft.commons.IMResult;

import java.io.Serializable;


/**
 * 自定义响应结构
 * 
 */
public class ImResult implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ImResult build(Integer status, String msg, Object data) {
        return new ImResult(status, msg, data);
    }

    public static ImResult build(Integer status, String msg) {
        return new ImResult(status, msg, null);
    }
    public static ImResult ok(Object data) {
        return new ImResult(data);
    }

    public static ImResult ok() {
        return new ImResult(null);
    }

    public ImResult() {

    }

    public ImResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ImResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

   

}
