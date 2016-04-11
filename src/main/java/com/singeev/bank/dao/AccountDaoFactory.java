package com.singeev.bank.dao;

public class AccountDaoFactory {
    public static final int MAP = 1;
    public static final int HSQL = 2;

    public static AccountDao getDAO(int daoType){
        switch (daoType){
            case MAP:
                return new AccountDaoMap();
            case HSQL:
                return new AccountDaoJdbc();
            default:
                return new AccountDaoMap();
        }
    }
}
