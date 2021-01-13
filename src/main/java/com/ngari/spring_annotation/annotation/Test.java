package com.ngari.spring_annotation.annotation;

import com.ngari.spring_annotation.annotation.bean.StuManage;
import com.ngari.spring_annotation.annotation.context.ApplicationContext;
import com.ngari.spring_annotation.annotation.context.impl.AnnotationClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description
 * @Author maoLy
 * @Date 2021/1/13
 **/


public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        ApplicationContext app = new AnnotationClassPathXmlApplicationContext("com.ngari.spring_annotation.annotation.bean");
        StuManage manage = (StuManage)app.getBean("sm");
        System.out.println(manage);
    }
}

