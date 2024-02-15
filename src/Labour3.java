import java.util.Scanner;
public class Labour3 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String trash = "";
                double miles = 0;
                int mph = 80;
                int mpday = 80 * 24;
                int mpmin = 80 * 60;
                double days = 0;
                double hours = 0;
                double minutes = 0;

                System.out.println("Miles: ");

                if (scan.hasNextDouble()) {

                    miles = scan.nextDouble();

                    hours = miles / mph;
                    days = miles / mpday;
                    minutes = miles / mpmin;

                    System.out.println("Days: " + days);
                    System.out.println("Hours: " + hours);
                    System.out.println("Minutes: " + minutes);

                }
                 else {

                    trash = scan.nextLine();
                    System.out.println("Incorrect value " + trash);
                }


    }
}
