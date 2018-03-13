package com.switchfully.springdi.src.taxes;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("AmericanTaxCalculation")
public class AmericanTaxCalculation implements TaxCalculation {

    @Override
    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(new BigDecimal("0.18")).add(new BigDecimal("950"));
    }
}
