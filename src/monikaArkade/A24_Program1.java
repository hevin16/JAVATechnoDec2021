/*WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
 */
package monikaArkade;

public class A24_Program1 {

	void findWord(String input) {
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]+"->"+arr[index].length());
		}
	}
	public static void main(String[] args) {
		A24_Program1 p1 = new A24_Program1();
		String input ="Hi Hello";
		p1.findWord(input);
	}
}
