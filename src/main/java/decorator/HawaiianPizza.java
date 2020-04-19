package decorator;

import java.math.BigDecimal;

public class HawaiianPizza extends PizzaDecorator {

    public HawaiianPizza(Pizza currentPizza) {
        super(currentPizza);
    }

    @Override
    public String description() {
        return super.description()+" pineapple +";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(5));
    }
}
