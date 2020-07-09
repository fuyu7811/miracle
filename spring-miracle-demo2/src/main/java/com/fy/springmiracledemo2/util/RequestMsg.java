package com.fy.springmiracledemo2.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author :  fuhw
 * @Description :  java类作用描述
 * @CreateDate :  2020/7/7 16:16
 * @UpdateUser :  fuhw
 * @UpdateDate :  2020/7/7 16:16
 * @UpdateRemark :  修改内容
 * @Version :  1.0
 */
public class RequestMsg {

    /**
     * 基础授权信息
     */
    private JSONObject authInfo;

    /**
     * 业务数据
     */
    private JSONObject data;

    public JSONObject getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(JSONObject authInfo) {
        this.authInfo = authInfo;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
