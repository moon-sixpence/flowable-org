package org.lq.example.shiro.dao;

import org.lq.example.shiro.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @date: 2020/10/15
 * @author: liuqiang
 */
public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
    /** 通过username查找用户信息*/
     UserInfo findByUsername(String username);
}
