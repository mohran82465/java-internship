import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weekday number in the if-else (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int num = scan.nextInt();

        String day;
        if (num == 1) {
            day = "Monday";
        } else if (num == 2) {
            day = "Tuesday";
        } else if (num == 3) {
            day = "Wednesday";
        } else if (num == 4) {
            day = "Thursday";
        } else if (num == 5) {
            day = "Friday";
        } else if (num == 6) {
            day = "Saturday";
        } else if (num == 7) {
            day = "Sunday";
        } else {
            day = "Invalid weekday number";
        }

        System.out.println("Weekday name: " + day);
        System.out.print("Enter the weekday number in the switch (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");

        num = scan.nextInt();

        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid weekday number";
                break;
        }

        System.out.println("Weekday name: " + day);
    }
}
