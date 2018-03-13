package com.switchfully.springdi.src.taxes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TaxCalculatorTest {

    @Mock
    private AmericanTaxCalculation americanTaxCalculation;

    @InjectMocks
    private TaxCalculator taxCalculator;

    @Test
    public void calculateTaxes_givenABelgianTaxCalculation_thenReturnTheCorrectTaxAmount() {
        when(americanTaxCalculation.calculateTaxes(new BigDecimal("23000").setScale(2)))
                .thenReturn(new BigDecimal("10350").setScale(2));
        assertThat(taxCalculator.calculateTaxes(new BigDecimal("23000").setScale(2)))
                .isEqualTo(new BigDecimal("10350").setScale(2));
    }

}