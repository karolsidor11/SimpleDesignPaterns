package strategy;

import java.math.BigDecimal;

public interface Vat {

    BigDecimal calculateVat(BigDecimal price);
}
