package basic;

import java.util.Scanner;

public class MethodLevel {
	MethodLevel(){
		
	}
	MethodLevel(String s){
		
	}
	MethodLevel(int a, int b)
	{
		this.sum(a, b);
	}
	
	public void fun() {
		System.out.println("Live everymoment with your fullest and have fun !!");
	}

	public  String thought() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your thought");
		String s= sc.nextLine();
	     return s;
	}

	public int sum(int dicipline, int commintment) {

		return commintment + dicipline;
	}
	
	public static void main(String[] args) {
		MethodLevel ml= new MethodLevel();
		int sum = ml.sum(10,20);
		System.out.println(sum);
		String s1= ml.thought();
		System.out.println(s1);
	}
}
