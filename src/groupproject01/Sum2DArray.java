package groupproject01;

public class Sum2DArray {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of all numbers.
		 */
		int sum = 0;
		int [][] numbers = { {1,2,3}, {4,5,6}, {7,8} };
		
		for(int index=0; index<numbers.length; index++) {
			for(int index2=0; index2<numbers[index].length ; index2++) {
				sum = sum + numbers[index][index2];	
				}
		}
			
		System.out.println(sum);

	}

}
