package com.eiisys.userManagementSystem.mapper;

import com.eiisys.userManagementSystem.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述  只留下一丝帅气〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Repository
public interface AccountMapper {
    List<Account> getAccountMsg();
}
