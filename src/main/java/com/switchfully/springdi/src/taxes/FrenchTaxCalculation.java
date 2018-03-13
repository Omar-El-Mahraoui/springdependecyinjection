package com.switchfully.springdi.src.taxes;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("FrenchTaxCalculation")
public class FrenchTaxCalculation implements TaxCalculation {

    @Override
    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(new BigDecimal("0.48"));
    }
}
