package strategy.problema1;

import java.math.BigDecimal;

public class PaymentProcessor {
    public BigDecimal efetuarPagamento(Payment payment){
        return payment.execute();
    }
}
