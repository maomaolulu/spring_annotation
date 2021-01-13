package com.ngari.spring_annotation.annotation.bean;

import com.ngari.spring_annotation.annotation.myannotation.Component;
import com.ngari.spring_annotation.annotation.myannotation.SetValue;


@Component(name="sm")
public class StuManage {
    @SetValue(isPOJO="yes",value="student")
    private Student student;

    public StuManage() {
        super();
        // TODO Auto-generated constructor stub
    }

    public StuManage(Student student) {
        super();
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StuManage [student=" + student + "]";
    }
}
