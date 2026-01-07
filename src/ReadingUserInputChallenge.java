import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while(counter <= 5) {

            System.out.println("Enter number #" +  counter + ":");
            String value = scanner.nextLine();
            try {
            sum += Integer.parseInt(value);
            if (counter == 5) {
                System.out.println("Sum of numbers is " +sum);
                return;
            }
            counter ++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Input");
            }

        }

    }
}
