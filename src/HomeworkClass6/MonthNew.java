package HomeworkClass6;

import java.util.Scanner;

public class MonthNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you birth month");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("You were born is season Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("You were born is season Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("You were born in season Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("You were born is season Fall");



        }






    }
}
