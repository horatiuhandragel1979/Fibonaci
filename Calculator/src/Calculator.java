import java.util.Scanner;

/**
 * Created by bery on 12/9/2019.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String semn = "";

        System.out.println("Introdu primul numar: ");
       int a = sc.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int b = sc.nextInt();

        System.out.println("Introdu semnul operatiei: ");
        semn = sc.next();

        switch (semn) {
            case ("+"):
                int suma = a + b;
                System.out.println("Suma este: " + suma);
                break;
            case ("-"):
                int diferenta = a - b;
                System.out.println("Diferenta este: " + diferenta);
                break;
            case ("*"):
                int produsul = a * b;
                System.out.println("Produsul este:" + produsul);
                break;
            case ("/"):
                double div = a / b;
                System.out.println("Impartirea este: " + div);
                break;
            default:
                System.out.println("Nu ai introdus un semn de operatie!!!");


        }


    }
}
