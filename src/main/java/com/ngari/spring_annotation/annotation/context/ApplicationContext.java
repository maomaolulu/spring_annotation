package com.ngari.spring_annotation.annotation.context;

/**
 * @InterfaceName ApplicationContext
 * @Description
 * @Author maoLy
 * @Date 2021/1/13
 **/

public interface ApplicationContext {
    public Object getBean(String beanName);
}
