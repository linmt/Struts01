package netctoss.dao;

import netctoss.entity.Cost;

import java.util.List;

/**
 * Created by 张洲徽 on 2019/1/4.
 */
public interface CostDao {
    List<Cost> findAll();
}
