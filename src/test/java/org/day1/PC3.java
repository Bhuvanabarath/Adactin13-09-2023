package org.day1;

public class PC3 {
	public enum DAYS
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDA,SATURDAY
	}
	public static void main(String[] args) {
		DAYS[] values = DAYS.values();
		System.out.println(values[2]);
		System.out.println("**********************");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println("**********************");
		
		for (DAYS days : values) {
			System.out.println(days);
		}
		System.out.println("**********************");
		
	}
}
