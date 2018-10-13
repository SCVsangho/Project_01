package ExtendsEx;

import java.util.Scanner;

class Person {
	int age;
	public String name;
	protected int cm;
	private int kg;
	
	void Setkg(int k){
		this.kg = k;
	}
	
	int Getkg(){
		return this.kg;
	}
}


public class Student_2 extends Person{
	
	static Scanner sc;
	
	void printKG(int c, int k){
		int weight = (int)((c-100)*0.9);
		if(weight < 60){
			System.out.println("저체중");
		}
		else if (weight >= 60 && weight <= 80){
			System.out.println("정상체중");
		}
		else {
			System.out.println("과체중");
		}
	}
	
	public static void main(String[] args) {
		Student_2 s = new Student_2();
		sc = new Scanner(System.in);
		
		System.out.println("나이 입력");
		s.age = sc.nextInt();
		System.out.println("이름 입력");
		s.name = sc.next();
		System.out.println("키 입력");
		s.cm = sc.nextInt();
		System.out.println("몸무게 입력");
		s.Setkg(sc.nextInt());
		
		
		s.printKG(s.cm, s.Getkg());
	}

}
