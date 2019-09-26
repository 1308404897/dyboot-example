package web.servlet;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import web.entity.Student;

/**
 * @Desc Mapper
 * @Author Zheng.LiMing
 * @Date 2019/9/14
 */
@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    @Select("select count(1) from tb_student")
    Integer cont();

    @Insert("insert tb_student value (#{stu.stuId},#{stu.stuName},#{stu.age})")
    Integer insert(@Param("stu") Student stu);
}
