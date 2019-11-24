package strategy;

import java.math.BigDecimal;

public class Vat32  implements Vat{

    @Override
    public BigDecimal obliczaVat(BigDecimal cena) {
        return cena.multiply(BigDecimal.valueOf(0.32));
    }
}
