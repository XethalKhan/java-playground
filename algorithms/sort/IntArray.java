package algorithms.sort;

public class IntArray{
	
	public static void selectionSort(Integer arr[]) {
		int length = arr.length;
		
		for(int i = 0; i < length - 1; i++) {
			int min_ix = i;
			
			for(int j = min_ix + 1; j < length; j++) {
				if(arr[j] < arr[min_ix]) {
					min_ix = j;
				}
			}
			
			Integer temp = arr[i];
			arr[i] = arr[min_ix];
			arr[min_ix] = temp;
		}
	}
	
	public static void bubbleSort(Integer arr[]) {
		int length = arr.length; 
		
        for (int i = 0; i < length-1; i++) 
            for (int j = 0; j < length-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                	Integer temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
	}
	
	public static void insertionSort(Integer arr[]) {
		int length = arr.length; 
		
        for (int i = 1; i < length; ++i) { 
            Integer key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j -= 1; 
            } 
            arr[j + 1] = key; 
        }
	}
}
