package com.stock.analyzer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest extends AbstractStockAnalyzerControllerTest{

    @Test
    public void testLogin() throws Exception {
        this.mvc.perform(
                MockMvcRequestBuilders.post("/login")
                        .param("username", "ravaneswaran@gmail.com")
                        .param("password", "N@hzim@t140180")).andExpect(status().isOk());
    }

}
