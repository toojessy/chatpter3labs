// Jessica Kamienski

import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("Enter any year: ");
        Scanner input = new Scanner(System.in);
        
        
        int leapYear = input.nextInt();
        
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0 ) {
            System.out.println("This is a Leap Year.");
        }
        else {
            System.out.println("This in NOT a Leap Year.");
        }
    
   
        
    }
}
