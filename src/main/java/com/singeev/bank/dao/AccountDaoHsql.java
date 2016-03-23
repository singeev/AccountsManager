package com.singeev.bank.dao;

import com.singeev.bank.entity.Account;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("HSQL")
public class AccountDaoHsql implements AccountDao {

    @Override
    public Boolean createAccount(String iban, String bic) {
        return null;
    }

    @Override
    public Map<Integer, Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account getAccount(int id) {
        return null;
    }

    @Override
    public Boolean updateAccount(int id, Account account) {
        return null;
    }

    @Override
    public Boolean deleteAccount(int id) {
        return null;
    }
}
