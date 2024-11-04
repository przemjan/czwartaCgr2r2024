public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 13;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba1 + ", druga: " + liczba2);

        int hours = 8;
        int days = 5;
        int weeks = 52;

        int workHoursPerYear = hours * days * weeks;

        System.out.println("Wynik: " + workHoursPerYear);

        char znak = '#';

        String napis = "Dzisiaj\t nie ma słońca i jest \"brzydko\".";

        napis = napis + "!";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis +" koniec \n");
        System.out.print("Mój napis: " + napis);

        boolean sun = true; //false

    }
}
