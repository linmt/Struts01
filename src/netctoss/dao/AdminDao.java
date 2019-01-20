package netctoss.dao;

import netctoss.entity.Admin;

/**
 * Created by 热带雨林 on 2019/1/20.
 */
public interface AdminDao {
    Admin findByCode(String adminCode);
}
