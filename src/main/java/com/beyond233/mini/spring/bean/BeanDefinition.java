package com.beyond233.mini.spring.bean;

import com.sun.istack.internal.Nullable;

/**
 * 描述: 该类是对Bean的相关定义和描述,也就是将用户定义好的POJO对象表示成容器内部的数据结构，这个数据结构就是BeanDefinition。
 * 通过BeanDefinition容器可以更好的对POJO对象也就是bean进行管理。
 *
 * @author beyond233
 * @since 2021/6/9 23:54
 */
public interface BeanDefinition {


    /**
     * 设置bean的类名称
     *
     * @param beanClassName bean的类名称
     * @since 2021/6/12 0:18
     */
    void setBeanClassName(@Nullable String beanClassName);

    /**
     * 获取bean的类名称
     *
     * @return {@link java.lang.String}
     * @since 2021/6/12 0:17
     */
    String getBeanClassName();
}
