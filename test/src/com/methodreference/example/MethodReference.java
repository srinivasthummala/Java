package com.methodreference.example;

import org.testng.annotations.Test;

public class MethodReference {
	
	//static method reference
	@Test
	public static void methodRefRunnableInterface(){
		Runnable r = MethodReference :: method;
		r.run();
		
		Thread t = new Thread(r);
		t.start();
		
	}
	
	public static void method(){
		for(int i=0; i<10; i++){
			System.out.println("method reference static method");
		}
	}
	
	//non static method reference mapping (::)
	@Test
	public void myInterfaceMethod(){
		MyInterface myInterface = i->System.out.println("value of i  : " + i);
		myInterface.show(6);
		
		MethodReference methodReference = new MethodReference();
		MyInterface myInterface2 = methodReference :: method1;
		myInterface2.show(10);
		
	}
	
	public void method1(int i){
		System.out.println("value of i from method1 : "+ i);
	}
	
	//constructor mapping
	@Test
	public void constructoMapping(){
		InterfaceB b  = s->new ClassA(s);
		b.get("using lamda");
		
		InterfaceB b2 =ClassA::new;
		b2.get("using constructor mapping");
	}

}
