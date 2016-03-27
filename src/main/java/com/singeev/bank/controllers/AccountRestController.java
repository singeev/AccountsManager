package com.singeev.bank.controllers;

import com.singeev.bank.dao.AccountDao;
import com.singeev.bank.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Scope("session")
public class AccountRestController {

    @Autowired
    @Qualifier("MAP")
    private AccountDao service;

    //not setup yet
    @RequestMapping(path = "/rest/account", method = RequestMethod.POST)
    @ResponseBody
    public Boolean addAccount(@RequestParam Account account) {
        return service.createAccount(account.getIban(), account.getBic());
    }

    //not setup yet
    @RequestMapping(path = "/rest/account", method = RequestMethod.GET)
    @ResponseBody
    public Account getAccount(@RequestParam(value = "id") int id, HttpServletResponse response) throws IOException {
        response.sendRedirect("/account");
        return service.getAccount(id);
    }

    //not setup yet
    @RequestMapping(path = "/rest/account", method = RequestMethod.PUT)
    public Boolean updateAccount(@RequestParam Account account, @RequestParam(value = "id") int id) {
        return service.updateAccount(id, account);
    }

    //work OK
    @RequestMapping(value = "/delete-account", method = RequestMethod.GET)
    public void deleteAccount(@RequestParam(value = "id") int id, HttpServletResponse response, HttpServletRequest request) throws IOException {
        service.deleteAccount(id);
        response.sendRedirect(request.getContextPath() + "/accounts");
    }
}
