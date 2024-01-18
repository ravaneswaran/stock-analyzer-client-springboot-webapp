package com.stock.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface StockAnalyzerRepository<T, I> extends JpaRepository<T, I> {
}
