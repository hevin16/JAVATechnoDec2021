package ashutosh;

class Calculator {

		int number1 = 10;
		int number2 = 20;
		
		
		void add(){
		
				int ans = number1+number2;
				System.out.println ("Addition is " + ans);
		}
		
		void subtract(){
		
				int sub = number2-number1;
				System.out.println ("Subtraction is " + sub);
		}
		
		void multiply(){
		
				int mult = number1*number2;
				System.out.println ("Multiplication is " + mult);
		}
		
		void division(){
		
				float div = number1/number2;
				System.out.println ("Division is " + div);
		}

		public static void main (String [] args ){
		
				Calculator calculator = new Calculator();
				calculator.add();
				calculator.subtract();
				calculator.multiply();
				calculator.division();
		}

}