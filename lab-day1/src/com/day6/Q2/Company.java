package com.day6.Q2;

class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // Company tries to deposit Rs 1000, 100 times
        for (int i = 0; i < 5; i++) {
            account.addAmount(1000);
        }
    }
}
