
import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        //Scanner object:

        Scanner scan = new Scanner(System.in);

        //Input Alma:
        System.out.println("Enter your String : ");
        String s = scan.nextLine();
        
        //En son karakteri bastirmak icin:
        
        System.out.println("The last character is: " + s.charAt(s.length()-1));
    }

}
