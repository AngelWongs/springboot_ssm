package cn.ken.service;

import cn.ken.entity.User;

import java.util.List;

public interface IUserService {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    List<User> queryPage();

    int updateByPrimaryKey(User record);
}
