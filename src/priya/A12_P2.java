package priya;
import java.util.Scanner;

public class A12_P2 {
	int maxPrime =0;
	int isPrimeNumberLogic(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			maxPrime = num;

		}
		return maxPrime;
	}


	void primeNumbersInRange(int startNum, int endNum) {

		for (int index = endNum; index >= startNum; index--) {
			maxPrime= isPrimeNumberLogic(index);
			if(maxPrime !=0)
				break;

		}
		System.out.println("Max Prime Num is: "+ maxPrime);
	}

	public static void main(String[] a) {
		A12_P2 maxPrimeNumber = new A12_P2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number of range: ");
		int startNum = sc.nextInt();
		System.out.println("Enter End number of range: ");
		int endNum = sc.nextInt();
		maxPrimeNumber.primeNumbersInRange(startNum, endNum);
		sc.close();
	}

}
