package bai_8;

import java.io.IOException;

public class Dog{

	private int a;
	public Dog() {
		a = 10;
	}
	public void talk(){
		System.out.println("go go");
	};
	
	public void doSomething() throws DogException{
		//implement
		System.out.println("doSomething");
		throw new DogException();
	}
}
