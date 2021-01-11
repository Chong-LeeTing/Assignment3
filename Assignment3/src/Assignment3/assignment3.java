package Assignment3;

import java.util.*;

public class assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Personal Background" );
		System.out.print("Enter your name");
		String name = in.next();
		System.out.println("Name: "+name);
		
		System.out.print("Enter your gender");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender: "+gender);
		
		System.out.print("Enter your age");
		int age = in.nextInt();
		System.out.println("Age: "+age);
		
		System.out.print("Enter your IC number");
		String ic = in.next();
		System.out.println("IC no: "+ic);
		
		System.out.print("Enter your matric number");
		int matric = in.nextInt();
		System.out.println("Matric no: "+matric);
		
		System.out.print("Enter your phone number");
		String phone = in.next();
		System.out.println("Phone no: "+phone);
		
		System.out.print("Enter your email");
		String email = in.next();
		System.out.println("Email: "+email);
		
		System.out.println("Services");
		String[]service= {"Diagnosis", "Treatment", "Dental", "Vaccination", "Immunisation"};
		System.out.println(service[0]);
		System.out.println(service[1]);
		System.out.println(service[2]);
		System.out.println(service[3]);
		System.out.println(service[4]);
		
		System.out.println("Charges:");
		System.out.println("for "+service[0]);
		double hours = in.nextDouble();
		if(hours <= 1) {
			System.out.println("The charge is RM 20");
		}else if(hours <= 2 && hours > 1) {
			System.out.println("The charge is RM 25");
		}else {
			System.out.println("The charge is RM 30");
		}
		
		System.out.println("for "+service[1]);
		double hours1 = in.nextDouble();
		if(hours1 <= 1) {
			System.out.println("The charge is RM 25");
		}else if(hours1 <= 2 && hours1 > 1) {
			System.out.println("The charge is RM 30");
		}else {
			System.out.println("The charge is RM 35");
		}
		
		System.out.println("for "+service[2]);
		double hours2 = in.nextDouble();
		if(hours2 <= 1) {
			System.out.println("The charge is RM 35");
		}else if(hours2 <= 2 && hours2 > 1) {
			System.out.println("The charge is RM 40");
		}else {
			System.out.println("The charge is RM 45");
		}
		
		System.out.println("for "+service[3]);
		double hours3 = in.nextDouble();
		if(hours3 <= 1) {
			System.out.println("The charge is RM 45");
		}else if(hours3 <= 2 && hours3 > 1) {
			System.out.println("The charge is RM 50");
		}else {
			System.out.println("The charge is RM 55");
		}
		
		System.out.println("for "+service[4]);
		double hours4 = in.nextDouble();
		if(hours4 <= 1) {
			System.out.println("The charge is RM 45");
		}else if(hours <= 2 && hours > 1) {
			System.out.println("The charge is RM 50");
		}else {
			System.out.println("The charge is RM 55");
		}
		
		int n = in.nextInt();
		System.out.println("Number of services:" +n);
		int i = 0;
		while(i < 3) {
			String serviceOrdered = in.next();
			System.out.println("Services ordered: "+serviceOrdered);
			i++;
		}
		
		System.out.println("Total price");
		int price[]= {20, 25, 45};
		print(price);
		
		for(int b:price)
			System.out.println(b);
	
		in.close();
	}
	public static void print(int a[]) {
		for(int i = 0; i <a.length; i++)
			a[i]= a[i]*1;
	}

}
