package com.dong.base;

import java.lang.annotation.ElementType;    // 导入 ElementType 枚举
import java.lang.annotation.Retention;      // 导入 Retention 注解
import java.lang.annotation.RetentionPolicy; // 导入 RetentionPolicy 枚举
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log{
	String operate_name() default "Not define";
}