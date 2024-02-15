public class MergeSortTest {
    public static void main(String[] args){
        int[] arr = new int[]{1278,10,14,16,123,145,142,26};
        mergeSort(arr);
        for(int i : arr)
            System.out.println(i);
        /*for(int i : merge(new int[]{1,78},new int[]{7,45})){
            System.out.println(i);
        }*/


    }


    public static void mergeSort(int[] array){
        if(array.length <= 1)
            return;
        //Determined midpoint:
        int midPoint = array.length/2;

        //Left and Right Part (Divide...) are determined in terms of size.
        int[] left = new int[midPoint];
        int[] right = new int[array.length - midPoint];
        //fill in the blanks onto left and right array using with for loop:
        for(int i = 0; i < left.length; i++){
            left[i] = array[i];
        }
        for(int j = 0, k = right.length; j < right.length; j++,k++){
            right[j] = array[k];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    public static int[] merge(int[] left, int[] right,int[] result){//Merge these onto result array


        int indexLeft = 0, indexRight = 0, indexForResultArray = 0;
        while(indexRight < right.length && indexLeft < left.length){
            if(left[indexLeft] <= right[indexRight]){
                result[indexForResultArray] = left[indexLeft++];
            }else{
                result[indexForResultArray] = right[indexRight++];
            }
            indexForResultArray++;
        }

        //For remain any element from left or right:
        while(indexRight < right.length){
            result[indexForResultArray++] = right[indexRight++];
        }
        while(indexLeft < left.length){
            result[indexForResultArray++] = left[indexLeft++];
        }
        return result;
    }


}
