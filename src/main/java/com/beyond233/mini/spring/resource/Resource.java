package com.beyond233.mini.spring.resource;

/**
 * 描述: 资源加载器：从文件系统、Class Path或者web容器等去加载以各种形式存在的BeanDefinition信息，如beans.xml、application.xml等。
 * 其就是对加载资源的IO操作的封装。
 *
 * @author beyond233
 * @since 2021/6/12 0:10
 */
public interface Resource {

    /**
     * 资源是否存在
     *
     * @return {@link boolean}
     * @since 2021/6/12 0:19
     */
    boolean exists();

    /**
     * 资源是否可读
     *
     * @return {@link boolean}
     * @since 2021/6/12 0:20
     */
    default boolean isReadable() {
        return this.exists();
    }

}
