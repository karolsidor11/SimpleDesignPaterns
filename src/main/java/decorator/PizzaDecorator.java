package decorator;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza currentPizza) {
        pizza = currentPizza;
    }

    public String description() {
        return pizza.description();
    }

    public BigDecimal price() {
        return pizza.price();
    }
}
