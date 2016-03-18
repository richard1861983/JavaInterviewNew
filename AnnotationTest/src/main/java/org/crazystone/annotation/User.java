/**
 * User.java 
 * org.crazystone.annotation 
 *
 * Function： TODO  
 *
 *   ver     date           author 
 * ────────────────────────────────── 
 *
 * Copyright (c) 2012, TNT All Rights Reserved. 
 */

package org.crazystone.annotation;

/**
 * ClassName:User 
 *
 * @author zhangzenglun
 * @version 1.0
 * @since v1.0
 * @Date 2012-9-11 下午2:01:06 
 */

@Table(tableName = "user")
public class User {
    @TableField(name = "user_id", isPrimaryKey = true)
    private int userId;
    @TableField(name = "user_name")
    private String userName;
    @TableField(name = "user_age")
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}  