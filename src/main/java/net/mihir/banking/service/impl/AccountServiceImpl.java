package net.mihir.banking.service.impl;

import org.springframework.stereotype.Service;

import net.mihir.banking.dto.AccountDto;
import net.mihir.banking.repository.AccountRepository;
import net.mihir.banking.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    

    @Override
    public AccountDto createAccount(AccountDto account) {
        return null;
    }
}
