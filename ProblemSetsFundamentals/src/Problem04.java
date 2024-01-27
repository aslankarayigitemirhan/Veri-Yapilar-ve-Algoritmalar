
public class Problem04 {

    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(1564));
    }

    public static String convertDecimalToBinary(int num) {
        String s = "";
        if (num != 0) {
            if (num % 2 == 0) {
                return s += convertDecimalToBinary(num / 2) + "0";
            }else{
                return s+= convertDecimalToBinary(num /2 ) + "1";
            }
            
        }
        return s;
        

    }

}
