package com.sales.market.service;

import com.sales.market.exception.UncheckedException;
import com.sales.market.model.AccountAux;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountAuxServiceTest {

    @Autowired
    private AccountAuxService service;

    @Test
    public void givenBalance100WhenDebit100TwiceShouldFail() throws ExecutionException, InterruptedException {
        AccountAux accountAux = new AccountAux();
        accountAux.setTotalDebit(BigDecimal.ZERO);
        accountAux.setTotalCredit(new BigDecimal("100"));
        accountAux.setBalance(new BigDecimal("100"));

        accountAux = service.save(accountAux);

        AccountAux finalAccountAux = accountAux;
        CompletableFuture<AccountAux> f1 = CompletableFuture.supplyAsync(() ->
                service.debit(finalAccountAux.getId(), new BigDecimal("100")))
                .orTimeout(60, TimeUnit.SECONDS);

        CompletableFuture<AccountAux> f2 = CompletableFuture.supplyAsync(() ->
                        service.debit(finalAccountAux.getId(), new BigDecimal("100")))
                .orTimeout(60, TimeUnit.SECONDS);
        System.out.println("----------------------- init debit 1");
        f1.get();
        System.out.println("------------------------ end debit 1");
        System.out.println("----------------------- init debit 2");
        f2.get();
        System.out.println("------------------------ end debit 2");
        System.out.println(accountAux);
        AccountAux res = service.getById(accountAux.getId());
        System.out.println(res.toString());

        assertEquals(0, res.getBalance().compareTo(BigDecimal.ZERO));

    }

    @Test
    public void givenBalance100WhenDebit100TwiceShouldFailByException() throws ExecutionException, InterruptedException {
        AccountAux accountAux = new AccountAux();
        accountAux.setTotalDebit(BigDecimal.ZERO);
        accountAux.setTotalCredit(new BigDecimal("100"));
        accountAux.setBalance(new BigDecimal("100"));

        accountAux = service.save(accountAux);

        AccountAux finalAccountAux = accountAux;
        CompletableFuture<AccountAux> f1 = CompletableFuture.supplyAsync(() ->
                        service.debit(finalAccountAux.getId(), new BigDecimal("100")))
                .orTimeout(60, TimeUnit.SECONDS);

        CompletableFuture<AccountAux> f2 = CompletableFuture.supplyAsync(() ->
                        service.debit(finalAccountAux.getId(), new BigDecimal("100")))
                .orTimeout(60, TimeUnit.SECONDS);
        try {
            System.out.println("----------------------- init debit 1");
            f1.get();
            System.out.println("----------------------- end debit 1");
            System.out.println("----------------------- init debit 2");
            f2.get();
            System.out.println("----------------------- end debit 2");
        }catch (Exception e){

        }
        System.out.println(accountAux);
        AccountAux res = service.getById(accountAux.getId());
        System.out.println(res.toString());

        assertEquals(0, res.getBalance().compareTo(BigDecimal.ZERO));

    }

}