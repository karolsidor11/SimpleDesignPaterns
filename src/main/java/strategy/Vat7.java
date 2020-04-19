package strategy;

import java.math.BigDecimal;

public class Vat7 implements Vat {

    @Override
    public BigDecimal calculateVat(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.07));
    }
}
