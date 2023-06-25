package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(0, 5_000, 15);

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void negativeBalanceAfterAmount() {
        CreditAccount account = new CreditAccount(2_000, 10_000, 15);

        account.pay(10_000);

        Assertions.assertEquals(-8_000, account.getBalance());
    }

    @Test
    public void nullBalanceAfterFullAmount() {
        CreditAccount account = new CreditAccount(2_000, 10_000, 15);

        account.pay(2_000);

        Assertions.assertEquals(0, account.getBalance());
    }

}
