import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first_name = scan.next();

        System.out.println("Enter your last name: ");
        String last_name = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your exam score: ");
        int score = scan.nextInt();

        System.out.println("Enter you feedback about the class: ");
        String feedback = scan.next();
        feedback += scan.nextLine();


        if(score >= 80 && score <= 100) {
            System.out.println("Your graded A....");
        } else if (score >= 60  && score <= 80){
            System.out.println("Your graded B....");
        } else if (score >= 50 && score <= 60){
            System.out.println("You are graded C");
        } else {
            System.out.println("You are required to redo the class.");
        }

        if(age >= 18 && age <= 30){
            System.out.println("You qualify for the army benefits..");
        } else {
            System.out.println("You do not qualify for free army benefits");
        }

    }
}