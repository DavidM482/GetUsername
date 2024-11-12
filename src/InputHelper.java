import java.util.Scanner;

public class GetUsernameInputHelper {
    public static void String getZeroLengthString(Scanner scan, String prompt, String zeroLengthString) {
        String input;
        boolean done = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.length() > 0) {
                done = true;
            } else {
                System.out.println("Sorry, your input is not long enough ");
            }
            scan.nextLine();
        } while (!done);
        return input;
    }
}
