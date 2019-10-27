package cn.itcast.service;

import cn.itcast.domain.User;

public interface UserService {
    //查询
    User findById(Integer id);
}
