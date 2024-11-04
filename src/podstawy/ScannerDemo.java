package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj średnią z matematyki: ");
        double average = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = scanner.nextLine();

        System.out.println("Twój numer buta: " + numerButa +
                ", średnia: " + average + ", imię: " + name);
    }
}
