

/*Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output
“It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
 */

package HomeworkClass6;

import java.util.Scanner;

public class FirstWeekDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter week day in numbers 1-7");
        int day=scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");

        }


    }


}
