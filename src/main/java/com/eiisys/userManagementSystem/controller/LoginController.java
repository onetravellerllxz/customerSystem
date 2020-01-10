package com.eiisys.userManagementSystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.eiisys.userManagementSystem.VO.ResultVO;
import com.eiisys.userManagementSystem.entity.Account;
import com.eiisys.userManagementSystem.enums.LoginStatus;
import com.eiisys.userManagementSystem.service.impl.AccountVeriftyServiceImpl;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Controller
@Slf4j
@RequestMapping
public class LoginController {
    @Autowired
    AccountVeriftyServiceImpl accountVeriftyService;
    @ResponseBody
    @RequestMapping("/newsaaslogin")
    public String saasBackgroundLogin(HttpServletRequest request, HttpServletResponse response){
        try {
            System.out.println(request.getCookies());
            Account account = accountVeriftyService.getAccount().get(0);
            response.sendRedirect("https://www.baidu.com?a=3asdas&token=dfsgsh");
        }catch (Exception e){
            e.printStackTrace();
            return ResultVO.success(LoginStatus.SUCCESS,"231","121",true).toString();
        }
        return ResultVO.success(LoginStatus.SUCCESS,"231","121",true).toString();
    }
}
