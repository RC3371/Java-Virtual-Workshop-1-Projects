import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        int[] prices = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            prices[i] = myKeyboard.nextInt();
            sum += prices[i];
        }
        System.out.println(sum);
    }
}
