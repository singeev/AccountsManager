package com.singeev.bank.dao;

import com.singeev.bank.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service("JDBC")
public class AccountDaoJdbc implements AccountDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    @Override
    public List<Account> getAllAccounts() {
        return jdbc.query("select * from accounts",
                BeanPropertyRowMapper.newInstance(Account.class));
    }

    @Override
    public Boolean createAccount(String iban, String bic) {
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
