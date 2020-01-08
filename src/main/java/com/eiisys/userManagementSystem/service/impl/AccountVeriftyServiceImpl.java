package com.eiisys.userManagementSystem.service.impl;

import com.eiisys.userManagementSystem.mapper.AccountMapper;
import com.eiisys.userManagementSystem.entity.Account;
import com.eiisys.userManagementSystem.service.IAccountVeriftyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Service
public class AccountVeriftyServiceImpl implements IAccountVeriftyService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<Account> getAccount(){
        return  accountMapper.getAccountMsg();
    }
}
