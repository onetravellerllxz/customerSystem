package com.eiisys.userManagementSystem.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/9
 * @since 1.0.0
 */
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //配置认证用户信息和权限
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //添加一个账号
        auth.inMemoryAuthentication().withUser("admin").password("123123").authorities("addOrder", "delOrder");
        auth.inMemoryAuthentication().withUser("root").password("123123").authorities("editOrder", "delOrder");
    }

    //配置拦截请求资源
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //拦截相应请求,选择httpbasic模式
        http.authorizeRequests()
                //配置权限
                .antMatchers("/aaaa").hasAnyAuthority("addOrder")
                .antMatchers("/rrrr").hasAnyAuthority("delOrder")
                .antMatchers("/newsaaslogin").hasAnyAuthority("editOrder")
                .antMatchers("/abb").fullyAuthenticated().and().formLogin();
    }

}