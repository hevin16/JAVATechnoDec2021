package yogeshNimbalkar;
//Assignment - 4 : 16 Dec 2021
class A4_FindDay{
	
	void displayDay(int dayIndex){
		if(dayIndex >= 1 && dayIndex <=5){
			System.out.println("dayIndex -> " + dayIndex +" : " +"Weekday");
		}else if(dayIndex >=6 && dayIndex <=7){
			System.out.println("dayIndex -> " + dayIndex +" : " +"Weekend");
		}else{
			System.out.println("dayIndex -> " + dayIndex +" : " +"Invalid index");
		}
	}
	
	public static void main(String[] args){
		A4_FindDay findday = new A4_FindDay();
		findday.displayDay(3);
		findday.displayDay(6);
		findday.displayDay(11);
		findday.displayDay(-3);
	}
}