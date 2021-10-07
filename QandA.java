import java.util.Scanner;

public class QandA {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        String answer1, answer2, answer3, answer4, answer5;

        System.out.println("What is your name?");
        answer1 = myKeyboard.next();
        System.out.println("What is your favorite color?");
        answer2 = myKeyboard.next();
        System.out.println("Do you have any pets?");
        answer3 = myKeyboard.next();
        System.out.println("Do you have any siblings?");
        answer4 = myKeyboard.next();
        System.out.println("Do you wear glasses?");
        answer5 = myKeyboard.next();

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
    }
}