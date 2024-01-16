package com.stock.analyzer.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public abstract class AbstractStockAnalyzerController {

    public HttpSession getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session == null){
            session = request.getSession(true);
        }
        return session;
    }

    public String destroySession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(session != null){
            session.invalidate();
        }
        return "redirect:/";
    }
}
