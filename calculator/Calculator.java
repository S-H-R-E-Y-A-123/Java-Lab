import java.util.*;


class Calculator{
	
	int calculateSum(int[] numbers){
		return numbers[0] + numbers[1];
	}

	int calculateDiff(int[] numbers){
		return numbers[0] - numbers[1];
	}
	
	int calculateProduct(int[] numbers){
		return numbers[0] * numbers[1];
	}

	int calculateQuotient(int[] numbers){
		if(numbers[1]==0){
			System.out.println("no div by 0");
			return 0;
		}
		return numbers[0] / numbers[1];
	}
	void fibonacci(int n){
		if(n<=0){
			System.out.println("Number of terms > than 0");
			return;
		}
		System.out.println("Fibonacci series up to "+n+ " terms: ");
		int a = 0, b=1;
		for(int i=1; i<=n;i++){
			System.out.print(a + " ");
			int next = a+b;
			a = b;
			b = next;
		}
		System.out.println();
	}

	int sumOfArray(int[] array){
		int sum = 0;
		for(int num : array){
			sum += num;
		}
		return sum;
	}

	double meanOfArray(int[] array){
		if (array.length == 0){
			System.out.println("Array is empty");
			return 0;
		}
		return (double) sumOfArray(array) / array.length;
	
	}
	int modeOfArray(int[] array){
		if (array.length==0){
			System.out.println("Array is empty");
			return -1;
		}
		int maxcount = 0;
		int mode = array[0];
	
		for(int i=0; i<array.length; i++){
			int count=0;

			for(int j=0; j<array.length; j++){
				if(array[j] == array[i]){
					count++;
				}
			}
			if(count > maxcount){
				maxcount = count;
				mode = array[i];
			}
		}
		return mode;
	}
	
}