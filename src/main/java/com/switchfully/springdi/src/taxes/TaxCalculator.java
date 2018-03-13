package com.switchfully.springdi.src.taxes;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(@Qualifier("AmericanTaxCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }

}
