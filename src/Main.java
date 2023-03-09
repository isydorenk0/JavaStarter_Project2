import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String input = scanner.nextLine();
        String output = "";
        for (int i = input.length() - 1; i > -1; i--){
            output += input.charAt(i);
        }
        System.out.println(input + " in reverse is: " + output);
    }
}