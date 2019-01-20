package netctoss.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by 热带雨林 on 2019/1/19.
 */
//所有控制器的基类，用于封装常用的session、request等，用于提供给子类进行复用
//ActionSupport是Struts2提供了Action基础类用于复用公共代码的类
//ApplicationAware
//RequestAware
public abstract class BaseAction
        extends ActionSupport
        implements SessionAware,ApplicationAware,RequestAware{
    protected Map<String,Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }

    protected Map<String,Object> application;
    protected Map<String,Object> request;

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }
}
