package krishna;

class DayIndex{
	void dayIndex_1(int index){
		if(index >= 1 && index <= 5)
			System.out.println("Weekdays");
		else if(index > 5 && index <= 7)
			System.out.println("Weekends");
		else
			System.out.println("Invalid Entry");
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.dayIndex_1(3);
		dayIndex.dayIndex_1(6);
		dayIndex.dayIndex_1(11);
		dayIndex.dayIndex_1(-3);
	}
}