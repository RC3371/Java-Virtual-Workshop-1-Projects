import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        String[] Inputs = new String[9];
        int i = 0;
        String AorAn;
        System.out.println("Please enter the name of one animal");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter the name of one country");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter one plural noun");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter the plural name of one food");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter the name of one device");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter one noun");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter one verb");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter one verb");
        Inputs[i] = myKeyboard.next();
        i++;
        System.out.println("Please enter one adjective");
        Inputs[i] = myKeyboard.next();
        i++;

        if(Inputs[4].charAt(0) == 65 || Inputs[4].charAt(0) == 69 || Inputs[4].charAt(0) == 73 || Inputs[4].charAt(0) == 79 || Inputs[4].charAt(0) == 85 || Inputs[4].charAt(0) == 97 || Inputs[4].charAt(0) == 101 || Inputs[4].charAt(0) == 105 || Inputs[4].charAt(0) == 111 || Inputs[4].charAt(0) == 117){
            AorAn = "an";
        }
        else{
            AorAn = "a";
        }

        System.out.println("The majestic " + Inputs[0] + " has roamed the forests of the " + Inputs[1] +
        " for thousands of years. Today, she wanders in search of " + Inputs[2] + 
        ". She must find food to survive. While hunting for " + Inputs[3] + ", she found " + AorAn + " " + Inputs[4] + 
        " hidden behind a " + Inputs[5] 
        + ". She has never seen anything like this before. What will she do? With the device in her teeth, she tries to " 
        + Inputs[6] + ", but nothing happens. She takes it back to her family. When her family sees it, they quickly " 
        + Inputs[7] + ". Soon, the device becomes " + Inputs[8] 
        + ", and the family decides to put it back where they found it.");
    }
}
