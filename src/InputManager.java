import java.util.Scanner;

public enum InputManager {
    ME;

    public static String loadInput(){

        System.out.println("Do you want to change the language?");

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }
}
