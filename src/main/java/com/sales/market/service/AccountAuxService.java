package com.sales.market.service;

import com.sales.market.model.AccountAux;
import com.sales.market.repository.AccountAuxWithDelayRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author arturo
 */
@Service
@AllArgsConstructor
public class AccountAuxService {
    private final AccountAuxWithDelayRepositoryImpl accountAuxWithDelayRepository;

    public AccountAux debit(Long accountAuxId, BigDecimal debitAmount) {
        AccountAux accountAux = accountAuxWithDelayRepository.getByIdWithDelay(accountAuxId, 10L);//10 sec delay
        if (accountAux.getBalance().compareTo(debitAmount) >= 0) {
            accountAux.setTotalDebit(accountAux.getTotalDebit().add(debitAmount));
            accountAux.setBalance(accountAux.getBalance().subtract(debitAmount));
        }
        return accountAuxWithDelayRepository.save(accountAux);
    }

    public AccountAux getById(Long id) {
        return accountAuxWithDelayRepository.getById(id);
    }

    public AccountAux save(AccountAux accountAux){
        return accountAuxWithDelayRepository.save(accountAux);
    }
}
