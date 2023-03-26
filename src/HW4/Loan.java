package HW4;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preffered loan amount");
        int loan = scanner.nextInt();
        if (loan <= 200000) {
            System.out.println("Loan ammount approved");
        } else {
            System.out.println("Loan ammount rejected");

        }
    }


}

