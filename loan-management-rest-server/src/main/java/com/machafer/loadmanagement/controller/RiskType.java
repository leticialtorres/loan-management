package com.machafer.loadmanagement.controller;

import com.machafer.loadmanagement.controller.InterestRate;

import java.math.BigDecimal;

public enum RiskType implements InterestRate {
    A {
        @Override
        public BigDecimal getInterestRate() {
            return new BigDecimal("0.00");
        }
    },
    B {
        @Override
        public BigDecimal getInterestRate() {
            return new BigDecimal("0.10");
        }
    },
    C {
        @Override
        public BigDecimal getInterestRate() {
            return new BigDecimal("0.20");
        }
    };
}
