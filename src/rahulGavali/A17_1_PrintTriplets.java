package rahulGavali;

//Print all triplets in which all 3 numbers are consecutive.
public class A17_1_PrintTriplets {

	void displayTriplates(int[] num) {
		for(int index=0; index<num.length-2; index++) {
			if(num[index]+1 == num[index+1] && num[index]+2 == num[index+2])
				System.out.println(num[index] + " -> " + num[index+1] + " -> " + num[index+2]);
		}
	}
	
	public static void main(String[] args) {
		A17_1_PrintTriplets printTriplates = new A17_1_PrintTriplets();
		int[] input = {10,13,14,15,16,19,20,22,23,24};
		printTriplates.displayTriplates(input);
	}
}