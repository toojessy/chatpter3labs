// Jessica Kamienski

import java.util.Scanner;

class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // you want an integer
        
        final int ZODIAC_MONKEY = 0;
        final int ZODIAC_ROOSTER = 1;
        final int ZODIAC_DOG = 2;
        final int ZODIAC_PIG = 3;
        final int ZODIAC_RAT = 4;
        final int ZODIAC_OX = 5;
        final int ZODIAC_TIGER = 6;
        final int ZODIAC_RABBIT = 7;
        final int ZODIAC_DRAGON = 8;
        final int ZODIAC_SNAKE = 9;
        final int ZODIAC_HORSE = 10;
        final int ZODIAC_SHEEP = 11;
        
       
        switch (year % 12) {
            // mod the year by 12, the number you get as the
            // result is what you use to compare
            case 0;
            System.out.println("Monkey");
            // does this help?
            break;
            
            case 1;
            System.out.println("Rooster");
            break;
            
            case 2;
            System.out.println("Dog")
            break;
                
        }
    }
}
