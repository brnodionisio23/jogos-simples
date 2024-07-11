package games.adivinheONumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    private static int drawnNumber;
    int userNumber;

    private Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public int drawNumber() {
        drawnNumber = random.nextInt(10) + 1;
        return drawnNumber;
    }

    public void game() {
        System.out.println("Digite um número entre [1 - 10]: ");
        userNumber = sc.nextInt();

        System.out.println(drawNumber());
    }
}
