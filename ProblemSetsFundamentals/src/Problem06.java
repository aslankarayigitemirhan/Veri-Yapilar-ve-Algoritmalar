import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] unitPrices = {6.5, 4.15, 3.50, 2.30, 3.45, 4.80, 8.10,4.15, 3.10, 2.76};
        double sum = 0;
        for(int i = 0; i < unitPrices.length; i++){
            System.out.println("Enter the quantity of item " + (i+1) + ":");
            sum += scan.nextInt() * unitPrices[i];
        }
        
        System.out.println("Total :" + sum);
    }
    
    
}
