package pl.sdacademy;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {


    public static void main(String[] args) {

        Random r = new Random();
        int value = r.nextInt(100);

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe: " + "Jest to twoja: " + i + " próba");
            Scanner number = new Scanner(System.in);
            int reading = number.nextInt();
            if (value == reading){
                System.out.println("Zgadłeś poprawnie");
                return;
            } else if (value > reading) {
                System.out.println("Wylosowana liczba jest większa od podanej, spróbuj ponownie");
            } else {
                System.out.println("Wylosowana liczba jest mniejsza od podanej, spróbuj ponownie");
            }
        }

    }
}
