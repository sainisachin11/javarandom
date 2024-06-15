import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //mini project
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNumber=0;
        do {
            System.out.println("guess my number: ");
            userNumber = sc.nextInt();
            if (userNumber == myNum) {
                System.out.println("Woooooo...Correct Number");
                break;
            } else if (userNumber > myNum) {
                System.out.println("your number is large: ");
            } else {
                System.out.println("your number is small: ");
            }
        }
            while (userNumber >= 0);
        System.out.println("my number was: ");
        System.out.println(myNum);



    }
}