
import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {
        int numberToDraw = getValidInput();
        do{
            drawLines(numberToDraw);
            numberToDraw = getValidInput();
        }
        while (numberToDraw != 0) ;
    }

    public static int getValidInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (1-9 or non-positive to stop):");

        int number = scan.nextInt();
        while (number > 0) {
            if (number > 9) {
                System.out.println("Enter a number (1-9 or non-positive to stop):");
                number = scan.nextInt();
            } else {
                return number;
            }
        }
        return 0;
    }

    public static void drawLines(int num) {
        for (int i = 1; i <= num; i++) {
            String s = "";
            for (int j = 1; j <= num; j++) {
                if (j <= i) {
                    s += j;
                } else {
                    s += "*";
                }
            }
            System.out.println(s);
        }
    }
}
