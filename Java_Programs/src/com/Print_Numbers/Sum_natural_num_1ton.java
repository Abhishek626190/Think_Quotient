package com.Print_Numbers;
//9. Write a program to find sum of all natural numbers between 1 to n
import java.util.Scanner;

public class Sum_natural_num_1ton {

	static int sum = 0, num;

	public void print() {

		for (int i = 1; i <= num; i++) {
			 
				sum = sum + i;
			}
		}
	

	public void displays() {
		System.out.println("The Sum of Natural Number from 1 to " + num + " is= " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_natural_num_1ton obj = new Sum_natural_num_1ton();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter terms to print sum of even numbers");
		num = sc.nextInt();
		obj.print();
		obj.displays();

	}

}
