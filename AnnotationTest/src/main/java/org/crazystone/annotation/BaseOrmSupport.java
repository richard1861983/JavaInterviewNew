/**
 * BaseOrmSupport.java 
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

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName:BaseOrmSupport 
 *
 * @since    v1.0
 * @Date     2012-9-11 下午3:27:00  
 */
public abstract  class BaseOrmSupport<T> {
    public  void save(T o){
        Class<? extends Object> entityClass = o.getClass();
        StringBuffer sql = new StringBuffer();

        sql.append("insert into ");

        Table a = (Table)entityClass.getAnnotation(Table.class);
        if (a!=null) {
            sql.append(a.tableName());
        } else {
            sql.append(entityClass.getName().substring(entityClass.getName().lastIndexOf(".")+1));
        }

        sql.append(" (");

        Field[] fields = entityClass.getDeclaredFields();
        String temp = "";
        StringBuffer valueSql = new StringBuffer();
        for (Field f:fields) {
            TableField tf = f.getAnnotation(TableField.class);

            //获得字段第一个字母大写   
            String firstLetter = f.getName().substring(0,1).toUpperCase();
            //转换成字段的get方法  
            String getMethodName = "get"+firstLetter+f.getName().substring(1);
            try {

                Method getMethod = entityClass.getMethod(getMethodName, new Class[] {});
                //这个对象字段get方法的值   
                Object value = getMethod.invoke(o, new Object[] {});

                if (f.getType().getName().equals(java.lang.String.class.getName())) {
                    valueSql.append(temp+"'"+value+"'");
                } else {
                    valueSql.append(temp+value);
                }

            } catch (Exception e) {
            }

            if (tf != null) {
                sql.append(temp+tf.name());
            } else {
                sql.append(temp+f.getName());
            }
            temp = ",";
        }

        sql.append(")values(");
        sql.append(valueSql);
        sql.append(")");

        System.out.println(sql.toString());
    }
}  