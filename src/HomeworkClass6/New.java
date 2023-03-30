package HomeworkClass6;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter Month");

        int month = read.nextInt();

        switch (month) {

            case 11:

            case 12:

            case 1:

            case 2:

                System.out.println("This is Winter Season in India");

                break;

            case 3:

            case 4:

            case 5:

            case 6:

                System.out.println("This is Summer Season in India");

                break;

            case 7:

            case 8:

            case 9:

            case 10:

                System.out.println("This is Rainy Season in India");

                break;

            default:

                System.out.println("Sorry! You entered Wrong Month no");

        }

    }

}





