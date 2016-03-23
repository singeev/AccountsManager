package com.singeev.bank.test;
import com.singeev.bank.controllers.AccountController;
import com.singeev.bank.dao.AccountDao;
import com.singeev.bank.entity.Account;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    private MockMvc mockMvc;

    @Mock
    private AccountDao accountServiceMock;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new AccountController())
                .setViewResolvers(viewResolver())
                .build();
    }

    @Test
    @Ignore
    public void findById_AccountEntryFound_ShouldAddAccountEntryToModelAndRenderViewAccountEntryView() throws Exception {
        Account account = new Account("AT61 1904 3002 3457 3201", "PSSAATWW");


        when(accountServiceMock.getAccount(1)).thenReturn(account);

        mockMvc.perform(get("/update-account", 1))
                .andExpect(status().isOk())
                .andExpect(view().name("account"))
                .andExpect(forwardedUrl("/WEB-INF/views/account.jsp"))
                .andExpect(model().attribute("account", hasProperty("id", is(1))))
                .andExpect(model().attribute("account", hasProperty("iban", is("AT61 1904 3002 3457 3201"))))
                .andExpect(model().attribute("account", hasProperty("bic", is("PSSAATWW"))));

        verify(accountServiceMock, times(1)).getAccount(1);
        verifyNoMoreInteractions(accountServiceMock);
    }

    private ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
