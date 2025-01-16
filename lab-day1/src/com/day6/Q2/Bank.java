package com.day6.Q2;

    class Bank implements Runnable {
        private Account account;

        public Bank(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            // Bank tries to withdraw Rs 1000, 100 times
            for (int i = 0; i < 5; i++) {
                account.subtractAmount(1000);
            }
        }
    }

