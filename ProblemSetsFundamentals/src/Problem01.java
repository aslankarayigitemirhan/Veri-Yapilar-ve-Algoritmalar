
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {

        //Scanner objesi yaratmak:
        Scanner scan = new Scanner(System.in);

        //Mesaj: 
        String inp;
        do {
            System.out.println("Enter an uppercase letter:");
            inp = scan.next();
        } while (inp.length() != 1);
        //Switch Case Yapisi:
        switch (inp.toUpperCase().charAt(0)) {
            case ('A'):
            case ('B'):
            case ('C'):
                System.out.println("The corresponding number is " + 2);
                break;
            case ('D'):
            case ('E'):
            case ('F'):
                System.out.println("The corresponding number is " + 3);
                break;
            case ('G'):
            case ('H'):
            case ('I'):
                System.out.println("The corresponding number is " + 4);
                break;
            case ('J'):
            case ('K'):
            case ('L'):
                System.out.println("The corresponding number is " + 5);
                break;
            case ('M'):
            case ('N'):
            case ('O'):
                System.out.println("The corresponding number is " + 6);
                break;
            case ('P'):
            case ('Q'):
            case ('R'):
            case ('S'):
                System.out.println("The corresponding number is " + 7);
                break;
            case ('T'):
            case ('U'):
            case ('V'):
                System.out.println("The corresponding number is " + 8);
                break;
            case ('W'):
            case ('X'):
            case ('Y'):
            case ('Z'):
                System.out.println("The corresponding number is " + 9);
                break;
            default:
                System.out.println("'" + inp + "'" + " is an INVALID INPUT !");
        }
    }

}
