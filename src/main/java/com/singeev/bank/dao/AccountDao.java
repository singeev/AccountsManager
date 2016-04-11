package com.singeev.bank.dao;

import com.singeev.bank.entity.Account;

import java.util.List;
import java.util.Map;

public interface AccountDao {
    Boolean createAccount(String iban, String bic);
    List<Account> getAllAccounts();
    Account getAccount(int id);
    Boolean updateAccount(int id, Account account);
    Boolean deleteAccount(int id);
}
