package com.yzpc.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by Ting on 2017/2/4.
 */
public class MessageAction extends ActionSupport implements
        ServletRequestAware{
    private HttpServletRequest request;
    public void setServletRequest(HttpServletRequest request){
        this.request=request;
    }
    public String execute()throws Exception{
        request.setAttribute("message","hio~");
        return super.execute();
    }
}
