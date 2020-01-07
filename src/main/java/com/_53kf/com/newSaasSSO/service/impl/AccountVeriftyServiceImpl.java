package com._53kf.com.newSaasSSO.service.impl;

import com._53kf.com.newSaasSSO.dao.AccountMapper;
import com._53kf.com.newSaasSSO.entity.Account;
import com._53kf.com.newSaasSSO.service.IAccountVeriftyService;
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
