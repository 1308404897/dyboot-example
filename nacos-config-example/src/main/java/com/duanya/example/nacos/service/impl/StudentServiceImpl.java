package com.duanya.example.nacos.service.impl;

import com.duanya.example.nacos.entity.Student;
import com.duanya.example.nacos.mapper.StudentMapper;
import com.duanya.example.nacos.service.IStudentService;
import com.duanya.spring.framework.annotation.DyAutowired;
import com.duanya.spring.framework.annotation.DyService;

import java.util.List;

/**
 * @Desc StudentServiceImpl
 * @Author Zheng.LiMing
 * @Date 2019/9/7
 */

@DyService
public class StudentServiceImpl implements IStudentService {


    @DyAutowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public Student selectStudentById(String id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public Integer updateStudent(Student stu) {
        return studentMapper.updateStudent(stu);
    }

    @Override
    public Integer deleteStudentById(String stuId) {
        return studentMapper.deleteStudentById(stuId);
    }

    @Override
    public Integer insertStudent(Student stu) {
        return studentMapper.insertStudent(stu);
    }

}