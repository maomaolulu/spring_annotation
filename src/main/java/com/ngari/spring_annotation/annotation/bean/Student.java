package com.ngari.spring_annotation.annotation.bean;

import com.ngari.spring_annotation.annotation.myannotation.Component;
import com.ngari.spring_annotation.annotation.myannotation.SetValue;

/**
 * @ClassName Student
 * @Description
 * @Author maoLy
 * @Date 2021/1/13
 **/
@Component
public class Student {
    @SetValue(value = "1001")
    private String id;
    @SetValue(value = "张三")
    private String name;

    public Student(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
