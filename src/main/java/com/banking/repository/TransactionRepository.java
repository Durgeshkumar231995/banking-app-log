package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}
