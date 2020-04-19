package decorator;

import java.math.BigDecimal;

public class CarbonaraPizza extends  PizzaDecorator {

    public CarbonaraPizza(Pizza currentPizza) {
        super(currentPizza);
    }

    @Override
    public String description() {
        return super.description()+" mushrooms + cheese";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(8));
    }
}
