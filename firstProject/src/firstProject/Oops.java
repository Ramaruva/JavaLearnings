package firstProject;

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tommy = new Dog("tommy",12);
		tommy.printingDetails();
		Dog tidy = new Dog(tommy);
		tidy.printingDetails();
		Puppy yummy = new Puppy("yemmy",5,"bowbow");
		yummy.printingDetails();
		
		Shape sqr= new Square("red",2.0);
		Shape rect = new Rectangle("orange", 3.56, 5.67);
		System.out.println(sqr.toString());
		System.out.println(rect.toString());
		System.out.println("hii");
		Student s1= new Student();
		s1.name="ram";
		s1.age=25;
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		s1.printInfo(s1.name,s1.age);
		Person p1=new Person();
		p1.setAge(30);
		p1.setName("Rahul");
		System.out.println(p1.getName()+" "+p1.getAge());
	}

}
//Inheritance starts here

class Dog{
	String name;
	int age;
	Dog(String name,int age){
		this.name=name;
		this.age=age;
	}
	Dog(Dog obj2){
		this.name=obj2.name;
		this.age=obj2.age;
	}
	public void printingDetails() {
		System.out.println(name+""+age);
	}
}

class Puppy extends Dog{
     String bark;
	 Puppy(String name, int age,String bark){
		  super(name,age);
		  this.bark = bark;
	 }
	public void printingDetails() {
		System.out.println(name+""+age+""+bark);
	}
}

//Inheritance end here

//Abstraction starts here

abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		System.out.println("shape constructor called");
		this.color=color;	
	}
	public String getCOlor() {
		return color;
	}
	
}

class Square extends Shape{
	double length;
	Square(String color,double length){
		  super(color);
		  this.length=length;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		
		return Math.pow(length,2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color+""+area();
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle(String color,double length, double breadth){
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		return length*breadth;
	}
	public String toString() {
		return color+""+area();
	}
}


//in java we have automatic garbage collector
//Polymorphism: using same method differently
//Method overloading creating same function but with different 
//Method overloading
//Method overloading is called runtime polymorphism.
class Student{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.print(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name+""+age);
	}
}


//Encapsulation

class Person{
	private String name;
	private  int age;
	
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age=age;
	 }
}