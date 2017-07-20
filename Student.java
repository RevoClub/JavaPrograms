import java.io.*;
import java.util.*;

class Student {
	String Name;
	int Id;
	Scanner scan = new Scanner(System.in);
	public void getData(){
		System.out.println("Enter Name");
		Name = scan.next();

		System.out.println("Enter ID");
		Id = scan.nextInt();	
	}
	public void showData(){
		System.out.println("Studnet Name: "+Name);
		System.out.println("Studnet Id: "+Id);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getData();
		s1.showData();
	}
}