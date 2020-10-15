package org.lq.example.shiro.config;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 *
 * @date: 2020/10/15
 * @author: liuqiang
 */
public class MySQLConfig extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}