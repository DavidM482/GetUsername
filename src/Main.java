import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = InputHelper.getNonZeroLenString(scan, "Please enter your username:");
        System.out.println("The username you entered is: " + username);
    }
}
