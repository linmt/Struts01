package netctoss.action;

/**
 * Created by 张洲徽 on 2019/1/18.
 */
public class CheckAction {
    private String adminCode;
    private String password;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
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

    public String execute(){
        if("tom".equalsIgnoreCase(adminCode)&&"123".equals(password)){
            error="欢迎";
            return "success";
        }
        error="用户名或密码错误";
        return "login";
    }
}
