package com.eiisys.userManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/9
 * @since 1.0.0
 */
@Controller
public class ErrorController {
    @RequestMapping("/error/403")
    public void error(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.qq.com");
    }
}
