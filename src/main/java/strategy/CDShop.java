package strategy;

import java.math.BigDecimal;

public class CDShop {

    public static void main(String[] args) {

        Vat vat7 = new Vat7();
        Vat vat32 = new Vat32();

        CD cd = new CD(BigDecimal.valueOf(20));

        BigDecimal cdWith7Vat = cd.getPrice(vat7);
        BigDecimal cdWith32Vat = cd.getPrice(vat32);

        System.out.println("Price CD with Vat7 : " + cdWith7Vat);
        System.out.println("Price CD with Vat32 : " + cdWith32Vat);
    }
}
