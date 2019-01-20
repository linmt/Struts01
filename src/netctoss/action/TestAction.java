package netctoss.action;

/**
 * Created by 热带雨林 on 2019/1/19.
 */
public class TestAction extends BaseAction {
    public String execute(){
        session.put("demo1","session");
        request.put("demo2","request");
        request.put("demo3","Application");
        return SUCCESS;
    }
}
