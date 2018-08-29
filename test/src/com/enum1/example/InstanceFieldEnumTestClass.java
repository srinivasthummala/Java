package com.enum1.example;

public class InstanceFieldEnumTestClass {
	
	public static void main(String[] args) {
		
		int num = InstanceFieldEnum.ONE.getNum();
		System.out.println(num);
		
		num = InstanceFieldEnum.FOUR.getNum();
		System.out.println(num);
		
		//Iterate through an Enum variable
		for(Day day : Day.values()){
			System.out.println(day);
		}
		
		System.out.println("\n");
		
		for(WeekDays days : WeekDays.values()){
			System.out.println(days);
			
		}
		
		System.out.println("\n");
		String days = WeekDays.FRIDAY.getDay();
		System.out.println(days);
	}
	
	public enum Day{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	
	public enum WeekDays{
		MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wedneday"),THURSDAY("Thursday"),FRIDAY("Friday"),SATURDAY("Saturday"),SUNDAY("Sunday");		
		 String day;

		private WeekDays(String day) {
			this.day = day;
		}

		public String getDay() {
			return day;
		}
		
	}
}
