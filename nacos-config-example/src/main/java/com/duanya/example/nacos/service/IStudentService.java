package com.duanya.example.nacos.service;

import com.duanya.example.nacos.entity.Student;
import com.duanya.example.nacos.mapper.StudentMapper;
import com.duanya.spring.framework.annotation.DyAutowired;
import com.duanya.spring.framework.annotation.DyService;

import java.util.List;

/**
 * @Desc IStudentService
 * @Author Zheng.LiMing
 * @Date 2019/9/7
 */
public interface IStudentService {

    List<Student> selectAllStudent();

    Student selectStudentById(String id);

    Integer updateStudent(Student stu);

    Integer deleteStudentById(String stuId);

    Integer insertStudent(Student stu);

}