package com.singeev.bank.test;


import com.singeev.bank.dao.AccountDao;
import com.singeev.bank.dao.AccountDaoFactory;
import com.singeev.bank.entity.Account;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AccountDaoMapTest {
    private AccountDao service;
    private Map<Integer, Account> testMap;

    @Before
    public void setup(){
        service = AccountDaoFactory.getDAO(AccountDaoFactory.MAP);
        testMap = new HashMap<>();
        testMap.put(1, new Account("AT61 1904 3002 3457 3201", "PSSAATWW"));
        testMap.put(2, new Account("CH93 0076 2011 6238 5295 7", "KBAGCH22"));
        testMap.put(3, new Account("MC93 2005 2222 1001 1223 3M44 555", "IIIGGB22"));
        testMap.put(4, new Account("GB29 RBOS 6016 1331 9268 19", "CPRTGB22"));
        testMap.put(5, new Account("GT82 TRAJ 0102 0000 0012 1002 9690", "ANTSGB2LTSY"));
    }

    @Test
    public void shouldReturnAccountsList(){
        Map<Integer, Account> dbMap = service.getAllAccounts();
        assertEquals(testMap, dbMap);
    }

    @Test
    public void shouldAddAndGetNewAccount(){
        Account account1 = new Account("aaa", "bbb");
        service.createAccount("aaa", "bbb");
        Account account2 = service.getAccount(6);
        assertEquals(account1, account2);
        service.deleteAccount(6);
    }

    @Test
    public void shouldUpdateAccount(){
        Account account1 = new Account("aaa", "bbb");
        service.updateAccount(1, account1);
        Account account2 = service.getAccount(1);
        assertEquals(account1, account2);
    }

    @Test
    public void shouldDeleteAccount(){
        service.deleteAccount(5);
        Account account = service.getAccount(5);
        assertNull(account);
    }
}
