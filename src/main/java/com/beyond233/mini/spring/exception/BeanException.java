package com.beyond233.mini.spring.exception;

/**
 * description: Bean异常类
 *
 * @author beyond233
 * @since 2021/6/11 22:55
 */
public class BeanException extends Exception {
    private static final long serialVersionUID = 5935386080379073759L;

    public BeanException() {
        super();
    }

    public BeanException(String message) {
        super(message);
    }

    public BeanException(String message, Throwable cause) {
        super(message, cause);
    }
}
