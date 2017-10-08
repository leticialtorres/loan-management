package com.machafer.loadmanagement.controller;

import javax.validation.constraints.NotNull;

public class CustomerRequest {

    @NotNull
    private String name;

    @NotNull
    private String limit;

    @NotNull
    private RiskType riskType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    public void setRiskType(RiskType riskType) {
        this.riskType = riskType;
    }
}
