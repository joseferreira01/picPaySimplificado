package com.picpaysimplificado.com.picpaysimplificado.repositorys;

import com.picpaysimplificado.com.picpaysimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Transactions extends JpaRepository<Transaction,Long> {
}
