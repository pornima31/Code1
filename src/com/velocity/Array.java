package com.velocity;

public class Array {
	public static void main(String[] args) {
		int num = 234567;
		int sum =0;
		while (num>0) {
			sum = sum + num/10;
			num = num/10;
		}
	System.out.println("sum of digit in number :" +sum);
}

}
