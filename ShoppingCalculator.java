import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        int[] prices = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            int missileNum = i+1;
            System.out.println("What is the price of missile number " + missileNum +"?");
            prices[i] = myKeyboard.nextInt();
            sum += prices[i];
        }
        System.out.println("The total cost of your missiles is $" + sum);
    }
}
