package strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Vat vat7 = new Vat7();
        Vat vat32 = new Vat32();

        CD cd = new CD(BigDecimal.valueOf(20));

        BigDecimal cdWith7Vat = cd.getPrice(vat7);
        BigDecimal cdWith32Vat = cd.getPrice(vat32);

        System.out.println("Cena płyty z Vat7 : " + cdWith7Vat);
        System.out.println("Cena płyty z Vat32 : " + cdWith32Vat);

    }
}
