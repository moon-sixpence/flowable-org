package org.lq.example.shiro.service;

import org.lq.example.shiro.entity.UserInfo;

/**
 *
 * @date: 2020/10/15
 * @author: liuqiang
 */
public interface UserInfoService {

    /** 通过username查找用户信息；*/
     UserInfo findByUsername(String username);
}
