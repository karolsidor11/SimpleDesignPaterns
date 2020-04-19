package decorator;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {

    @Override
    public String description() {
        return "Basic pizza +";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(10);
    }
}
