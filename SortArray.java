package pckage;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {10,1,20,2,54,5,74,98,42};
		//int[] left = {1,74,455,7789};
		//int[] right = {10,200,300,2000};
	
		for(int i : mergeSort(arr))
			System.out.print(i + " ");
		
	}
	//SELECTION SORT:
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int k = i+1; k < arr.length; k++) {
				if(arr[k] < arr[minIndex])
					minIndex = k;
			}
			//Swap Operation:
			int swElement = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = swElement;
		}
	}
	//INSERTION SORT:
	public static void insertionSort(int[] array) {
		for(int i = 1; i <array.length;i++) {
			int validTraversingMainElement = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > validTraversingMainElement) {
				array[j+1]= array[j];
				j--;
			}
			array[j+1] = validTraversingMainElement;
		}
	}
	
	//MERGE SORT ***************************
	//There are two functions: merge() , mergeSort due to that divide-conquer...
	//Merge two ordered list function:
	public static int[] merge(int[] right,int[] left) {//[1,200], [74,85]
		int[] returnedArray = new int[right.length + left.length];
		
		int leftCount = 0;
		int rightCount = 0;
		int mergedCount = 0;
		
		while(rightCount < right.length && leftCount < left.length) {
			if(right[rightCount] < left[leftCount]) {
				returnedArray[mergedCount] = right[rightCount];
				rightCount++;
			}else {
				returnedArray[mergedCount] = left[leftCount];
				leftCount++;
			}
			mergedCount++;
		}
		while(leftCount < left.length) {
			returnedArray[mergedCount] = left[leftCount++];
			mergedCount++;
		}
		while(rightCount < right.length) {
			returnedArray[mergedCount++] = right[rightCount++];
		}
		
		return returnedArray;
	}
	
	public static int[] mergeSort(int[]array){
		if(array.length <= 1) {
			return array;
		}
		int mid = array.length / 2;
		
		int[] leftArray = new int[mid];
		//Copy the array that is determined part
		for(int i = 0; i <= mid-1; i++) {
			leftArray[i] = array[i];
		}
		int[] rightArray = new int[array.length - mid]; 
		//Copy the array that is determined part
		for(int j = 0 , k = mid; k < array.length; k++,j++) {
			rightArray[j] = array[k];
		}
		
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);
		return merge(rightArray,leftArray);
		
	}

}
