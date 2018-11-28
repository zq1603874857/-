package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface UserInfoService  {
    //查询所有用户
    List<UserInfo> findAll();
    List<UserAddress> findUserAddressByUserId(String userId);

}
