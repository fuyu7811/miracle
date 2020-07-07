package com.fy.springmiracledemo2.util;

/**
 * @Description   :  java类作用描述
 * @author        :  fuhw
 * @CreateDate    :  2020/7/7 16:15
 * @UpdateUser    :  fuhw
 * @UpdateDate    :  2020/7/7 16:15
 * @UpdateRemark  :  修改内容
 * @Version       :  1.0
 */
public class ResultMsg {
    /**
     * 响应编码，0是正常，其他异常，详细看msg
     */
    private int statusCode = 0;

    /**
     * 响应信息
     */
    private String message;

    private Object data;

    public ResultMsg(){

    }

    ResultMsg(int code, String msg){
        this.statusCode =code;
        this.message = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ResultMsg ok(){
        return new ResultMsg(0,"success");
    }

    public static ResultMsg error(int code,String msg){
        return new ResultMsg(code,msg);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
