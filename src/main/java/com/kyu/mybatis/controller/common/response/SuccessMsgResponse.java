package com.kyu.mybatis.controller.common.response;

import lombok.Data;

@Data
public class SuccessMsgResponse {
    private Boolean success;
    private String msg;

    public SuccessMsgResponse(){
        this.success = true;
        this.msg = "";
    }

    public SuccessMsgResponse(String msg){
        this.success = false;
        this.msg = msg;
    }
}
