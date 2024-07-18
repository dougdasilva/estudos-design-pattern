package strategy.problema1;

import java.math.BigDecimal;

public class Boleto implements Payment{
    @Override
    public BigDecimal execute() {
        return BigDecimal.ZERO;
    }
}
