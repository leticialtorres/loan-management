package com.machafer.loadmanagement.controller;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CustomerResponse {

    private String id;

    private String name;

    private String limit;

    private String riskType;

    private String interestRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        Locale ptBr = new Locale("pt", "BR");
        this.limit = NumberFormat.getCurrencyInstance(ptBr).format(limit);
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {

        Locale ptBr = new Locale("pt", "BR");
        this.interestRate = NumberFormat.getCurrencyInstance(ptBr).format(interestRate);
    }
}
