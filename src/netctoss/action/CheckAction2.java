package netctoss.action;


import com.opensymphony.xwork2.ActionContext;
import netctoss.entity.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by 张洲徽 on 2019/1/18.
 */
public class CheckAction2 implements SessionAware{
    private User user;
    private String error;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    public String execute(){
        //获取session
        //方式一
        //ActionContext在Struts2中代表当前Struts2环境相关的信息
//        ActionContext ctx=ActionContext.getContext();
//        Map<String,Object> session=ctx.getSession();
//        session.put("loginName","kity");

        //方式二，需要继承SessionAware接口，该接口是Struts2提供的，实现setSession方法，这样Struts2就可以在程序运行期间注入session
        //这种方式更简便，因为可以定义一个Action的抽象父类，封装session等公共的方法
        session.put("loginName","kity");


        if("tom".equalsIgnoreCase(user.getAdminCode())&&"123".equals(user.getPassword())){
            error="欢迎";
            return "success";
        }
        error="用户名或密码错误";
        return "login";
    }

    private Map<String,Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
}
