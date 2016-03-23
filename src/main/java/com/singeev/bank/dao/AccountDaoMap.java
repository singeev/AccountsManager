package com.singeev.bank.dao;

import java.util.*;

import com.singeev.bank.entity.Account;
import org.springframework.stereotype.Service;

@Service("MAP")
public class AccountDaoMap implements AccountDao {
    private static Map<Integer, Account> accountMap = new HashMap<>();
    private static int listCount = 5;

    // --- create default accounts list ---//
    static {
        accountMap.put(1, new Account("AT61 1904 3002 3457 3201", "PSSAATWW"));
        accountMap.put(2, new Account("CH93 0076 2011 6238 5295 7", "KBAGCH22"));
        accountMap.put(3, new Account("MC93 2005 2222 1001 1223 3M44 555", "IIIGGB22"));
        accountMap.put(4, new Account("GB29 RBOS 6016 1331 9268 19", "CPRTGB22"));
        accountMap.put(5, new Account("GT82 TRAJ 0102 0000 0012 1002 9690", "ANTSGB2LTSY"));
    }

    // --- method to add new account ---//
    public Boolean createAccount(String iban, String bic) {
        if (accountMap.put(++listCount, new Account(iban, bic)) != null) {
            return true;
        } else {
            return false;
        }
    }

    // --- method to delete an account by ID ---//
    public Boolean deleteAccount(int id) {
        if (accountMap.remove(id) != null) {
            return true;
        } else {
            return false;
        }
    }

    // --- method to get all accounts ---//
    public Map<Integer, Account> getAllAccounts() {
        return accountMap;
    }

    // --- method to get account by ID ---//
    public Account getAccount(int id) {
        return accountMap.get(id);
    }

    // --- method to edit account ---//
    public Boolean updateAccount(int id, Account account) {
        if (accountMap.replace(id, account) != null) {
            return true;
        } else {
            return false;
        }
    }
}
