package netctoss.action;

import com.lmt.entity.User;

/**
 * Created by 张洲徽 on 2019/1/18.
 */
public class CheckAction2 {
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
        if("tom".equalsIgnoreCase(user.getUserName())&&"123".equals(user.getPassword())){
            error="欢迎";
            return "success";
        }
        error="用户名或密码错误";
        return "login";
    }
}
