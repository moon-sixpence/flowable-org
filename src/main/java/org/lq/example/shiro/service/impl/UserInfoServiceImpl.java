package org.lq.example.shiro.service.impl;

import org.lq.example.shiro.dao.UserInfoDao;
import org.lq.example.shiro.entity.UserInfo;
import org.lq.example.shiro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @date: 2020/10/15
 * @author: liuqiang
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}