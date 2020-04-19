package decorator;

import java.math.BigDecimal;

public class ChickenPizza extends   PizzaDecorator{

    public ChickenPizza(Pizza currentPizza) {
        super(currentPizza);
    }

    @Override
    public String description() {
        return super.description()+" chicken +";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(10));
    }
}
