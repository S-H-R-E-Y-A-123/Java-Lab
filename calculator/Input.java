import java.util.*;

class Input{

	//function to input two numbers
	int[] inputNumbers(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int first_number = scan.nextInt();

		System.out.println("Enter second number: ");
		int second_number = scan.nextInt();

		return new int[]{first_number,second_number};
		
	}

	//function to input an array
	int[] inputArray(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = scan.nextInt();

		int[] array = new int[size];
		System.out.println("Enter" + size + "elements: ");
		for (int i=0; i<size; i++){
			array[i] = scan.nextInt();
		}
		return array; 
	}
}





