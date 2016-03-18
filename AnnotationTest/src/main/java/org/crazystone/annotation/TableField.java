/**
 * TableField.java 
 * org.crazystone.annotation 
 *
 * Function： TODO  
 *
 *   ver     date           author 
 * ────────────────────────────────── 
 *           2012-9-11      zhangzenglun 
 *
 * Copyright (c) 2012, TNT All Rights Reserved. 
 */

package org.crazystone.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:TableField 
 * @version 1.0
 * @since v1.0
 * @Date 2012-9-11 下午2:14:41 
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface TableField {
    public String name();

    public boolean isPrimaryKey() default false;
}  