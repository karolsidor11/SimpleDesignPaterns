package decorator;

public class Pizzeria {

    public static void main(String[] args) {

        CarbonaraPizza carbonaraPizza = new CarbonaraPizza(new ChickenPizza(new BasicPizza()));

        System.out.println("Your order :");
        System.out.println(carbonaraPizza.description());
        System.out.println("To pay : "+ carbonaraPizza.price()+ " PLN");
    }
}
