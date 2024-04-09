import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age ;
        double height ;
        boolean isRaining;
        String city;

        System.out.println("Enter yr age : ");
        age=scan.nextInt();
        System.out.println("Enter the height of building : ");
        height=scan.nextDouble();
        System.out.println("Enter the weather if it's raining or not (true/false) : ");
        isRaining=scan.nextBoolean();
        System.out.println("Enter the city name : ");
        city=scan.next();

        System.out.printf("the age : %d%n the height of the building : %.2f %n",age,height);
        System.out.printf("if it is raining : %s %n the city name : %s ",isRaining?"yes":"no",city);
    }
}
