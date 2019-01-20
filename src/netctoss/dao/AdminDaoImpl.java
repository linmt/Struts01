package netctoss.dao;

import netctoss.entity.Admin;

/**
 * Created by 热带雨林 on 2019/1/20.
 */
public class AdminDaoImpl implements AdminDao {
    public Admin findByCode(String adminCode) {
        // 模拟根据账号查询管理员
        // 假设当前管理员表中只有一条数据，
        // 其admin_code=caocao
        if(adminCode == null)
            return null;

        if(adminCode.equals("caocao")) {
            Admin a = new Admin();
            a.setAdmin_id(5000);
            a.setAdmin_code("caocao");
            a.setPassword("123");
            a.setName("曹操");
            a.setEmail("caocao@qq.com");
            a.setTelephone("110");
            return a;
        }
        return null;
    }
}
