package com.beyond233.mini.spring.bean;

/**
 * BeanDefinition注册器：将BeanDefinition注册到IOC容器中，即将其注入到一个HashMap中，
 * 然后IOC容器通过这个map来持有这些BeanDefinition数据
 *
 * @author beyond233
 * @since 2021/6/12 0:23
 */
public interface BeanDefinitionRegistry {

    /**
     * 将BeanDefinition注入到IOC容器中
     *
     * @param beanName       bean的名称
     * @param beanDefinition bean的定义信息的数据结构抽象
     * @since 2021/6/12 0:25
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
