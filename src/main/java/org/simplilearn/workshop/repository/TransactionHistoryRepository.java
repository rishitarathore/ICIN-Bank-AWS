package org.simplilearn.workshop.repository;

import java.util.List;

import org.simplilearn.workshop.model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long>{

	public List<TransactionHistory> findAllByUserId(long userId);
}
