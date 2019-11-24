package strategy;

import java.math.BigDecimal;

public class CD {

    private BigDecimal cena;

    public CD(BigDecimal cena) {
        this.cena = cena;
    }

    public BigDecimal pobierzCenę(Vat vat) {
        return cena.add(vat.obliczaVat(cena ));
    }
}
