package com.phase1.assistedprograms;


class Animal{  
void eat(){
	System.out.println("eating");
	 }  
}  
class Dog extends Animal{  
void bark(){
	System.out.println("barking");
	}  
}  
class Inheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.eat();  
d.bark();  
}
}  