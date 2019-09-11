package web.controller;

/**
 * @Desc
 * @Author Zheng.LiMing
 * @Date 2019/9/12
 */

import com.duanya.spring.framework.annotation.*;
import web.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/** DyRequestMapping 设置请求根路径，默认为"/"， DyRestController 告诉程序让mvc来处理*/
@DyRequestMapping
@DyRestController
public class HelloworldController {

    /**
     * 从请求路径上获取参数
     *
     * http://127.0.0.1:8081/s1000
     *
     *
     * @return
     */
    @DyGet("/{value}")
    public String pathValue(@DyPathVariable String value){
        System.out.println("请求路径参数为："+value);
        return "请求路径参数为："+value;
    }

    /**
     * 从请求中获取请求的参数
     *
     * http://127.0.0.1:8081?value=S20000
     *
     * @param value
     * @return
     */
    @DyGet
    public String paramValue(@DyRequestParameter(value = "value")String value){
        return "请求参数为："+value;
    }

    /**
     * 如何接受一个简单对象,目前支持单个对象或List<Student>
     *
     * http://127.0.0.1:8081
     * 请求主体为
     * {"stuId":"S1000"}
     * @return
     */
    @DyPost
    public Student post(@DyRequestBody Student student){
        return student;
    }

    /**
     * 如何接受一个List,目前支持单个对象或List<Student>
     *
     * http://127.0.0.1:8081/student/list
     * 请求主体为
     * [
     * {
     * "stuId":"s11111"
     * },
     * {
     * "stuId":"s11112"
     * }
     * ]
     * @return
     */
    @DyPost("student/list")
    public  List<Student>  postList(@DyRequestBody List<Student> student){
        return student;
    }

    /**
     * 如何获取HttpServletRequest , HttpServletResponse
     *
     * @param request
     * @param response
     * @return
     */
    @DyGet("/test/url")
    public String getUrl(HttpServletRequest request, HttpServletResponse response){
        return request.getRequestURI();
    }

}
