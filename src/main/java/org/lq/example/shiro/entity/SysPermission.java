package org.lq.example.shiro.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.*;

import lombok.Data;

/**
 *
 * @date: 2020/10/15
 * @author: liuqiang
 */
@Entity
@Data
public class SysPermission {
    @Id
    @GeneratedValue
    private Long id; // 主键.
    private String name; // 权限名称,如 user:select
    private String description; // 权限描述,用于UI显示
    private String url; // 权限地址.
    @JsonIgnoreProperties(value = {"permissions"})
    @ManyToMany
    @JoinTable(name = "SysRolePermission", joinColumns = {@JoinColumn(name = "permissionId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roles; // 一个权限可以被多个角色使用

    /** getter and setter */
}