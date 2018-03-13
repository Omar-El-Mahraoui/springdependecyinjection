package com.switchfully.springdi.src;

import com.switchfully.springdi.src.taxes.TaxCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;

@ComponentScan(basePackages = {"com.switchfully.springdi.src.taxes"})
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Application.class);

        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        BigDecimal resultOfTaxCalculation = taxCalculator.calculateTaxes(new BigDecimal("23000"));

        System.out.println(resultOfTaxCalculation.toString());
    }

}
