import java.time.LocalDate;
import java.util.Scanner;

    public class WeddingPlanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the bride's first name: ");
            String brideFirstName = scanner.nextLine();

            System.out.print("Enter the bride's last name: ");
            String brideLastName = scanner.nextLine();

            Person bride = new Person(brideFirstName, brideLastName);

            System.out.print("Enter the groom's first name: ");
            String groomFirstName = scanner.nextLine();

            System.out.print("Enter the groom's last name: ");
            String groomLastName = scanner.nextLine();

            Person groom = new Person(groomFirstName, groomLastName);

            Couple couple = new Couple(bride, groom);

            System.out.print("Enter the wedding date (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateString);

            System.out.print("Enter the wedding location: ");
            String location = scanner.nextLine();

            Wedding wedding = new Wedding(couple, date, location);

            System.out.println("Wedding details:");
            System.out.println("Couple: " + wedding.getCouple().getBride().getFirstName() + " " + wedding.getCouple().getBride().getLastName() + " and " + wedding.getCouple().getGroom().getFirstName() + " " + wedding.getCouple().getGroom().getLastName());
            System.out.println("Wedding Date:" + wedding.getDate());
            System.out.println("Wedding Location: " + wedding.getLocation());

        }
    }
