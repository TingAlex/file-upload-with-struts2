package com.yzpc.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Ting on 2017/2/4.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String login() {
        ActionContext ac=ActionContext.getContext();
        if(username.equals("admin")&&password.equals("123")){
            ac.put("success","hei~");
            return SUCCESS;
        }
        else{
            ac.put("error","errprrr");
            return ERROR;
        }
    }
    public String register(){
        return "register";
    }
}
