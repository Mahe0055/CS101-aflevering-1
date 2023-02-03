import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPersonElligibleToVote(); //Kalder method 1
        getMaxNumber(3, 22, 45);
        System.out.println(getMaxNumber(3, 22, 45));
        System.out.println(getMinNumber(3,22,45));
        isNumberOdd();
        displayNames("Maheen Ahmad ILyas");
        Car mercedes = new Car("Mercedes", 25000);
        mercedes.start();
        mercedes.stop();
        mercedes.move();
    }

    //Method 1
    public static void isPersonElligibleToVote() {
        Scanner sc = new Scanner(System.in); //Opretter scanner object.
        int ageOfPerson = sc.nextInt();

        if (ageOfPerson >= 18) {
            System.out.println("Yaay! You are eligible to vote");
        } else {
            System.out.println("Sorry! you are not eligible to vote");
        }
    }

    //Method 2
    public static int getMaxNumber(int numberA, int numberB, int numberC) {
        return Math.max(numberA, Math.max(numberB, numberC));
    }

    public static int getMinNumber(int numberA, int numberB, int numberC) {
        return Math.min(numberA, Math.max(numberB, numberC));
    }

    //Method 3
    public static boolean isNumberOdd() {
        Scanner numberInput = new Scanner(System.in); //Opretter scanner object.
        int numberIsOdd = numberInput.nextInt();

        if (numberIsOdd % 2 == 0) {
            System.out.println(false);
            return false;
        }
        else {
            System.out.println(true);
            return true;
        }
    }

    //Method 4
    public static void displayNames(String name) {
        System.out.println(name); //fullname
        String[] letters = name.split(" ");
        String firstname = letters[0];
        String middlename = letters[1];
        String lastname = letters[2];
        System.out.println(firstname.charAt(0) + ". " + middlename.charAt(0) + ". " + lastname);
    }

}