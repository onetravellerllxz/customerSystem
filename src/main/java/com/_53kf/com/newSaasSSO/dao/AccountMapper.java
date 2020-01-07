package com._53kf.com.newSaasSSO.dao;

import com._53kf.com.newSaasSSO.entity.Account;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Component
public interface AccountMapper {
    List<Account> getAccountMsg();
}
