import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("what is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello," +name+ ", nice to meet you!");


    }
}
