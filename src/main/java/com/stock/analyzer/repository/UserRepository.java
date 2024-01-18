package com.stock.analyzer.repository;

import com.stock.analyzer.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends StockAnalyzerRepository<User, String> {

    @Query("SELECT u FROM User u WHERE u.emailId = ?1 and u.password = ?2")
    public User findBy(String username, String password);
}
