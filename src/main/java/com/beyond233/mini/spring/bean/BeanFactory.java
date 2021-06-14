package com.beyond233.mini.spring.bean;

import com.beyond233.mini.spring.exception.BeanException;

/**
 * description: BeanFactory作为顶层父类接口，定义了其IOC容器所设定的基本的功能规范。
 *
 * @author beyond233
 * @since 2021/6/9 23:50
 */
public interface BeanFactory {

    /**
     * 根据bean的名称从IOC容器中获取一个bean
     *
     * @param name Bean的名称
     * @return {@link java.lang.Object}
     * @throws BeanException Bean异常
     * @since 2021/6/11 22:01
     */
    Object getBean(String name) throws BeanException;

    /**
     * 判断IOC容器中是否存在指定名称的bean
     *
     * @param name Bean的名称
     * @return {@link boolean}
     * @since 2021/6/11 22:52
     */
    boolean containsBean(String name);

    /**
     * 判断IOC容器中指定名称的bean是否属于单例
     *
     * @param name Bean的名称
     * @return {@link boolean}
     * @since 2021/6/11 22:52
     */
    boolean isSingleton(String name);

    /**
     * 判断IOC容器中指定名称的bean是否属于原型实例
     *
     * @param name Bean的名称
     * @return {@link boolean}
     * @since 2021/6/11 22:52
     */
    boolean isPrototype(String name);
}
