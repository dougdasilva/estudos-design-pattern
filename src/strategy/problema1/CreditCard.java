package strategy.problema1;

import java.math.BigDecimal;

public class CreditCard implements Payment{
    @Override
    public BigDecimal execute() {
        return new BigDecimal("1.1");
    }
}
