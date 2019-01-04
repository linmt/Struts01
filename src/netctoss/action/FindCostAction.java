package netctoss.action;

import netctoss.dao.CostDao;
import netctoss.dao.DaoFactory;
import netctoss.entity.Cost;

import java.util.List;

/**
 * Created by 张洲徽 on 2019/1/4.
 */
public class FindCostAction {
    //向页面输出数据
    private List<Cost> costs;

    public String execute() {
        CostDao dao = DaoFactory.getCostDao();
        costs = dao.findAll();
        return "success";
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }
}
