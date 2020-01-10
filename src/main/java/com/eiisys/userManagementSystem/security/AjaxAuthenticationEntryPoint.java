package com.eiisys.userManagementSystem.security;

import com.alibaba.fastjson.JSON;
import com.eiisys.userManagementSystem.VO.ResultVO;
import com.eiisys.userManagementSystem.enums.LoginStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/9
 * @since 1.0.0
 */
public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(LoginStatus.USER_NEED_AUTHORITIES, false)));
    }
}
