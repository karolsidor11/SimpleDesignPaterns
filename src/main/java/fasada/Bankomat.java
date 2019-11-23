package fasada;

import java.util.Scanner;

public class Bankomat {

    private static Bankomat bankomat = new Bankomat();
    private BankFasade bankFasade = new BankFasade();

    public static void main(String[] args) {

        bankomat.startBankomat();
    }

    public void startBankomat() {

        System.out.println("WITAJ W BANKOMACIE BANKU PKO");
        System.out.println("Włoż  kartę i podaj PIN");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź PIN:");
        int PIN = scanner.nextInt();

        boolean identyfikacja = bankFasade.identyfikacja(123456789L, PIN);
        if (identyfikacja) {
            pokazMenu();
        } else {
            System.out.println("Autoryzacja nie powiodłą się. Karta zostanie zatrzymana.");
        }
    }

    public void pokazMenu() {
        System.out.println("MENU");
        System.out.println("1-Stan konta");
        System.out.println("2-Wypłata  gotówki");
        System.out.println("3-Koniec");
    }
}
