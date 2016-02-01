package arrays;

public class PrintArray {

	public static void main(String[] args) {
		int[] someArray = {1,1,2,3,5,8,13};
		printArray(someArray);
	}

	public static void printArray(int[] array){
		System.out.println("Printing array:");
		for (int index = 0; index < array.length; index++){
			System.out.println(array[index]);
		}
	}
}
