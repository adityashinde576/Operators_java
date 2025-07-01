import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Arithmetic Operators
        int nextYearAge = age + 1;
        int doubleAge = age * 2;
        int halfAge = age / 2;
        int ageModulus = age % 2;

        // Logical Operators
        boolean isTeenager = (age >= 13 && age <= 19);
        boolean isChildOrSenior = (age < 13 || age > 60);

        // Conditional Operator
        String ageCategory = (age >= 18) ? "an adult" : "a minor";

        // Output
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Next year, you will be " + nextYearAge + ".");
        System.out.println("Twice your age is " + doubleAge + ", and half your age is " + halfAge + ".");
        System.out.println("Your age % 2 = " + ageModulus);

        System.out.println("Are you a teenager? " + isTeenager);
        System.out.println("Are you a child or a senior citizen? " + isChildOrSenior);
        System.out.println("You are " + ageCategory + ".");

        scanner.close();
    }
}




