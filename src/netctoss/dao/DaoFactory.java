package netctoss.dao;

/**
 * Created by 张洲徽 on 2019/1/4.
 */
/**
 *	DAO工厂，用来统一的创建DAO实例。由于当前项目没有使用Spring，所以我们自己写
 *	一个工厂来代替Spring容器，也能达到组件之间（Action和DAO组件）解耦的目的。
 */
public class DaoFactory {
    private static CostDao costDao = new CostDaoImpl();

    public static CostDao getCostDao() {
        return costDao;
    }
}
