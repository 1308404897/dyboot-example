package web;

import com.duanya.spring.framework.annotation.DyBootApplication;
import com.duanya.spring.framework.starter.run.DyBootApplicationRun;

/**
 * @Desc web第二个案例，请求如何接受参数
 * @Author Zheng.LiMing
 * @Date 2019/9/12
 */
@DyBootApplication
public class WebApplication {
    public static  void  main(String[] args ){
        DyBootApplicationRun.run(WebApplication.class);
    }
}
