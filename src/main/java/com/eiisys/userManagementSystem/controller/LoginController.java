package com.eiisys.userManagementSystem.controller;

import com.eiisys.userManagementSystem.enums.LoginStatus;
import com.eiisys.userManagementSystem.service.impl.AccountVeriftyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@RequestMapping("/login")
@Controller
@Slf4j
public class LoginController {
    @Autowired
    AccountVeriftyServiceImpl accountVeriftyService;

    @ResponseBody
    @RequestMapping("/newsaaslogin")
    public String saasBackgroundLogin(HttpServletRequest request){
        try {
            System.out.println(request.getCookies());
            System.out.println(accountVeriftyService.getAccount());
            System.out.println(LoginStatus.LOGIN_IS_OVERDUE);
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
        return accountVeriftyService.getAccount().toString();
    }

}
