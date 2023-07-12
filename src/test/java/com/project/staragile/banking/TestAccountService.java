package com.project.staragile.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestAccountService {

	@Autowired
	AccountService accountService;
	
	@Test
	public void testAccountRegistraiton() {
		Account account = new Account(101012023,"Subhajit Saha","Saving Account",20000);
		assertEquals(account.getAccountNumber(),accountService.registerDummyAccount().getAccountNumber());
		assertEquals(account.getAccountName(),accountService.registerDummyAccount().getAccountName());
	}
}
