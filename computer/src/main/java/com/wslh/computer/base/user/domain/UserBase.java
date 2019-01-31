package com.wslh.computer.base.user.domain;

/**
 * @author: lihang
 * @createTime: 2019-01-30 17:32
 * @description:用户基本信息
 */
public class UserBase {
    private String id; //UUID
    private String userName; //登录名称
    private String password; //密码如果不输入则自动生成 登录时可以不输入密码
    private String salt; //盐
    private String phone; //手机号
    private String crateDataTime; //创建时间
    private String state; //状态
}
