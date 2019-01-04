package netctoss.dao;

import netctoss.entity.Cost;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张洲徽 on 2019/1/4.
 */
public class CostDaoImpl implements CostDao {
    public List<Cost> findAll() {
        List<Cost> list = new ArrayList<Cost>();
        //模拟查询全部资费数据
        Cost c1 = new Cost();
        c1.setCost_id(1);
        c1.setName("A套餐");
        c1.setBase_duration(60);
        c1.setBase_cost(15.0);
        c1.setUnit_cost(0.15);
        c1.setStatus("0");
        c1.setDescr("A套餐");
        c1.setCreat_time(new Timestamp(System.currentTimeMillis()));
        c1.setCost_type("2");
        list.add(c1);

        Cost c2 = new Cost();
        c2.setCost_id(2);
        c2.setName("B套餐");
        c2.setBase_duration(80);
        c2.setBase_cost(20.0);
        c2.setUnit_cost(0.15);
        c2.setStatus("1");
        c2.setDescr("B套餐");
        c2.setCreat_time(new Timestamp(System.currentTimeMillis()));
        c2.setCost_type("2");
        list.add(c2);

        return list;
    }

}

