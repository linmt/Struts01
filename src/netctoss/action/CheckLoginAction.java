package netctoss.action;

import netctoss.dao.AdminDao;
import netctoss.dao.DaoFactory;
import netctoss.entity.Admin;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by 热带雨林 on 2019/1/20.
 */
public class CheckLoginAction {
    private String adminCode;
    private String password;
    private String code;
    private String errorMsg;

    public String execute() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        //校验验证码
        String imageCode = (String)session.getAttribute("imageCode");
        if(!imageCode.equalsIgnoreCase(code)) {
            errorMsg = "验证码错误.";
            return "fail";
        }
        //查询管理员
        AdminDao dao = DaoFactory.getAdminDao();
        Admin admin = dao.findByCode(adminCode);
        //校验账号
        if(admin == null) {
            //账号不存在，回到登录页
            errorMsg = "账号不存在.";
            return "fail";
        } else if (!admin.getPassword().equals(password)) {
            //密码不正确，回到登录页
            errorMsg = "密码错误.";
            return "fail";
        } else {
            //校验成功，将登录信息写入session
            session.setAttribute("admin", admin);
            //跳转到系统首页
            return "success";
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
