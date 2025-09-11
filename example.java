import java.util.Scanner;

class Student{
	public void name(String name){
		System.out.println("Your name is "+name);
	}
	
	public void id(){
		System.out.println("Your Id is : ");
	}
}

class Main{
	public static void main(String[] args){
		Student std1 = new Student();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your name here : ");
		String name = input.nextLine();
		
		System.out.println("");
		
		std1.name(name);
			
	}
}