package strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Vat vat7 = new Vat7();
        Vat vat32 = new Vat32();

        CD płytaCD = new CD(BigDecimal.valueOf(20));

        BigDecimal cenaPłytyZVat7 = płytaCD.pobierzCenę(vat7);
        BigDecimal cenaPłytyZVat32 = płytaCD.pobierzCenę(vat32);

        System.out.println("Cena płyty z Vat7 : "+cenaPłytyZVat7);
        System.out.println("Cena płyty z Vat32 : "+cenaPłytyZVat32);

    }
}
