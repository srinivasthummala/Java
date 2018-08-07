package com.lamda.example;

public interface MyInterface {
	
	void sum(int a, int b);
	
	default void myethod(){
		System.out.println(" am in My Interface method");
	}

}
