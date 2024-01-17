package com.stock.analyzer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public abstract class AbstractStockAnalyzerControllerTest {

    @Autowired
    protected MockMvc mvc;
}
