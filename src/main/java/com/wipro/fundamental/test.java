package com.wipro.fundamental;
public class test {
	public static void main(String[] xyz) {
		scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scan.nextInt();
		if(number%2 == 0) {
			System.out.println(number + "is even");
		}
		else {
			System.out.println(number + "is odd");
		}
	}

}
