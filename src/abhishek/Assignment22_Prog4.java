package abhishek;
public class Assignment22_Prog4 {

	void displayCountToGetSumOFFiftyInFiboSeries() {
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int sum = 2;

		while (sum <= 50) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}

		System.out.println("The Total numbers required from Fibonacci Series to get a sum of 50 : " + count);
	}

	public static void main(String[] args) {
		Assignment22_Prog4 assignment22_Prog4 = new Assignment22_Prog4();
		assignment22_Prog4.displayCountToGetSumOFFiftyInFiboSeries();
	}

}
