package ranjeet;
class Calculations{
	
	void rateOfInterest(int priAmt, float time, float rateOfIn){
		double roi = (priAmt * time * rateOfIn) / 100;
		System.out.println("Total Simple Interest = "+roi);
	}
	
	void convertFahrenheToCelsius(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Converion Of Fahrenheit To Celsius = "+celsius);
	}
	
	public static void main(String[] a){
		Calculations calculations = new Calculations();
		calculations.rateOfInterest(100000, 7.9f, 6.80f);
		calculations.convertFahrenheToCelsius(67);
	}

}