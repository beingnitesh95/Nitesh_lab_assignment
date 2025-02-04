package com.bankapp_labexam.bankapp.repo;

import com.bankapp_labexam.bankapp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {


}
