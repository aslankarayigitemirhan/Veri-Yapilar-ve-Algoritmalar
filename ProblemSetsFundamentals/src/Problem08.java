
public class Problem08 {

    public static void main(String[] args) {
        int[] arr = {89, 95, 72, 83, 99, 54, 86, 75, 92, 73, 79, 75, 82, 73};
        double sum = 0;
        double stdDev = 0;
        for(int i: arr)
            sum += i;
        double avg = sum / arr.length;
        
        System.out.println("Average :" + avg);
        
        for(int item : arr)
            stdDev += Math.pow(avg - item,2);
        
        
        stdDev /= arr.length-1;
        stdDev = Math.sqrt(stdDev);
        System.out.println("Standard Deviation: " + stdDev);
    } 
}
