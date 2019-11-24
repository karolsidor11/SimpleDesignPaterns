package strategy;

import java.math.BigDecimal;

public class Vat7 implements  Vat {

    @Override
    public BigDecimal obliczaVat(BigDecimal cena) {
        return cena.multiply(BigDecimal.valueOf(0.07));
    }
}
