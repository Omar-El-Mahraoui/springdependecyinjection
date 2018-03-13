package com.switchfully.springdi.src.taxes;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("BelgianTaxCalculation")
@Primary
public class BelgianTaxCalculation implements TaxCalculation {

    @Override
    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(new BigDecimal("0.45"));
    }
}
