import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] elements = {"Akmens", "Skeres", "Papirits"};

        while (true) {
            System.out.println("Izvelies - Akmens, Skeres, Papirits");

            String user = scan.nextLine();

            String computer = elements[new Random().nextInt(elements.length)];
            System.out.println(computer);

            if (user.equals(computer)) {
                System.out.println("Neizskirts");

            } else if (user.equals ("Akmens")) {
                System.out.println(computer.equals("Papirits") ? "Tu zaudeji!" :"Tu uzvareji!");
            } else if (user.equals ("Papirits")) {
                System.out.println(computer.equals("Skeres") ? "Tu zaudeji!" :"Tu uzvareji!");
            } else if (user.equals ("Skeres")) {
                System.out.println(computer.equals("Akmens") ? "Tu zaudeji!" :"Tu uzvareji!");
            }
        }
    }
}