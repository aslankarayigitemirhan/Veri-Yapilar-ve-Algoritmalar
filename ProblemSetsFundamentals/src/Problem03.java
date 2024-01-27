import java.util.Scanner;
public class Problem03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a four-digit binary string:");
        
        String s = scan.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(s.length()-1-i) == '1')
                sum += Math.pow(2, i);
            
        }
        
        System.out.println("The decimal number for "+ s +  " is:" + sum);
   }
}
