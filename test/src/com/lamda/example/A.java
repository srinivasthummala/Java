package com.lamda.example;

public interface A {
	
	void show();
	
	default void showMyethod(){
		System.out.println("am in Interface A default method method");
	}

}
