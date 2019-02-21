package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int max = 0;
		int index1 = 0;
		int index2 = 0;
			
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(max < arr[i] * arr[j]) {
					max = arr[i] * arr[j];
					
					index1 = i;
					index2 = j;
				}
			}
		}

		System.out.println(arr[index1]+""+arr[index2]);
		
		
	}// end of findMaxProduct class
}//end of class
