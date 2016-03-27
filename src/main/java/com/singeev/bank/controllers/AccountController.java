package com.singeev.bank.controllers;

import com.singeev.bank.dao.AccountDao;
import com.singeev.bank.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("session")
public class AccountController {

	/*
	List of qualifiers for different
	AccountDao implementations (instead of DAOFactory):
	"MAP" - AccountDaoMap
	"HSQL" - AccountDaoHsql
	 */
	@Autowired
	@Qualifier("MAP")
	private AccountDao service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectFromRootPage(ModelMap model) {
		model.addAttribute("accounts", service.getAllAccounts());
		return "accounts-list";
	}

	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public String showAccountsPage(ModelMap model) {
		model.addAttribute("accounts", service.getAllAccounts());
		return "accounts-list";
	}

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String showAccount(ModelMap model) {
		model.addAttribute("account", new Account());
		return "account";
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String addAccount(ModelMap model, Account account) {
		service.createAccount(account.getIban(), account.getBic());
		model.clear();
		return "redirect:accounts";
	}

	@RequestMapping(value = "/update-account", method = RequestMethod.GET)
	public String showAccountForUpdate(ModelMap model, @RequestParam int id) {
		model.addAttribute("account", service.getAccount(id));
		return "account";
	}

	@RequestMapping(value = "/update-account", method = RequestMethod.POST)
	public String updateAccount(Account account, @RequestParam int id) {
		service.updateAccount(id, account);
		return "redirect:accounts";
	}

// deleting account request is handled by RESTController in AccountRestController class

}
