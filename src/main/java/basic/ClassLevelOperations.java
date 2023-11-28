package basic;

import javax.management.remote.SubjectDelegationPermission;

public class ClassLevelOperations {

	static int instanceVar =40;
	
public static void main(int[] args) {
	System.out.println("int [] args");
	int a=10,b=20;
	int c=a+b;
	System.out.println("value of c : "+ c);
	System.out.println("instanceVar"+ instanceVar);
}

public static void main(String[] args) {
	System.out.println("String [] args");
	System.out.println("Value of instanceVar:"+ instanceVar);

	
}
}
