package facade;

import java.util.Scanner;

public class Bankomat {

    private static Bankomat cashMachine = new Bankomat();
    private BankFacade bankFacade = new BankFacade();

    public static void main(String[] args) {
        cashMachine.startBankomat();
    }

    public void startBankomat() {
        System.out.println("WELCOME TO THE BANKOMAT OF THE BANK PKO");
        System.out.println("Insert card and enter PIN");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PIN:");
        int PIN = scanner.nextInt();

        boolean isIdentification = bankFacade.identification(123456789L, PIN);
        if (isIdentification) {
            showMenu();
        } else {
            System.out.println("Authorization failed. The card will be held.");
        }
    }

    public void showMenu() {
        System.out.println("MENU");
        System.out.println("1-Account balance");
        System.out.println("2-Cash withdrwal");
        System.out.println("3-End");
    }
}
