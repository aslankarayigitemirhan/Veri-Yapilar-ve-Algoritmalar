
import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String snew = "";
        int extraBlankCount = 0;
        for (int i = 0; i < s.length(); i++) {
            while (s.charAt(i) == ' ') {
                extraBlankCount++;
                if (extraBlankCount > 1) {
                    i++;
                    continue;
                } else {

                    snew += s.charAt(i);
                }
            }
            extraBlankCount = 0;
            snew += s.charAt(i);

        }

        System.out.print("New Sentences : \n");
        System.out.print(snew);
    }
}
