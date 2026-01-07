import java.util.Scanner;

public class MinMaxChallange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            double minimumNumber = 0;
            double maximumNumber = 0;
        for (int i = 1; i >= 1; i++) {
            System.out.println("Enter number. To quit enter any character:");
            String number = scanner.nextLine();

            try {
                double enteredValue = Double.parseDouble(number);

                if (minimumNumber == 0 && maximumNumber == 0) {
                    minimumNumber = enteredValue;
                    maximumNumber = enteredValue;
                } else if( enteredValue < minimumNumber) {
                    minimumNumber = enteredValue;
                } else if (enteredValue > maximumNumber) {
                    maximumNumber = enteredValue;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Minimum entered number was: " + minimumNumber + ". Maximum entered number was: " + maximumNumber);
                System.out.println("Exiting loop");
                break;
            }

        }
    }

}
