package com.switchfully.springdi.src.taxes;

import java.math.BigDecimal;

public interface TaxCalculation {

    BigDecimal calculateTaxes(BigDecimal yearlyIncome);

}
