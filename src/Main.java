import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPersonElligibleToVote(); //Kalder method 1
        getMaxNumber(3, 22, 45);
        System.out.println(getMaxNumber(3, 22, 45));
        System.out.println(getMinNumber(2,14,34));
        isNumberOdd(); //Kalder method 3
        displayNames("Maheen Ahmad ILyas"); //Method 4
        Car mercedes = new Car("Mercedes", 25000);
        Driver robert = new Driver("Robert", 30);
        Employee salesman = new Employee("Adam", "Smith", 1400);
        Employee manager = new Employee("John", "Anderson", 3000);

        //Kalder metoderne fra Car class
        mercedes.start();
        mercedes.stop();
        mercedes.move();
        //Kalder metoden fra Driver class
        robert.drive();

        //Print objects' salary from Employee class
        System.out.println(salesman.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(salesman.getHigherSalary());
        System.out.println(manager.getHigherSalary());
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
        String[] letters = name.split(" ");
        String firstName = letters[0];
        String middleName = letters[1];
        String lastName = letters[2];
        System.out.println(firstName.charAt(0) + ". " + middleName.charAt(0) + ". " + lastName);
    }

}