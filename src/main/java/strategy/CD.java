package strategy;

import java.math.BigDecimal;

public class CD {

    private BigDecimal price;

    public CD(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice(Vat vat) {
        return price.add(vat.calculateVat(price));
    }
}
