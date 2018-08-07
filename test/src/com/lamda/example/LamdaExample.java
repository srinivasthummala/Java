package com.lamda.example;

import org.testng.annotations.Test;

public class LamdaExample {

	@Test(enabled = false)
	public void generalClaculations() {
		
		System.out.println("===========================================================");
		
		MyInterface obj = (a, b) -> System.out.println("sum : " + (a + b));
		obj.sum(10, 20);
		
		System.out.println("===========================================================");

		MyInterface obj1 = (a, b) -> {
			int max = a > b ? a : b;
			System.out.println("max : " + max);
		};

		obj1.sum(22, 2);
		obj1.myethod();
		
		System.out.println("===========================================================");


		MyInterface obj2 = (a, b) -> System.out.println("min: " + (a < b ? a : b));
		obj2.sum(7, 5);
		
		System.out.println("===========================================================");

	}
	
	@Test(enabled=false)
	public void lamdaWithNoParameters(){
		System.out.println("===========================================================");

		
		A a = () -> System.out.println("this is lamda with no parameters");
		a.show();
		a.showMyethod();
		
		System.out.println("===========================================================");

		A a1 = new A() {
			
			@Override
			public void show() {
				System.out.println("this is anonymyos method");
				
			}
		};
		a1.show();
		
		System.out.println("===========================================================");

	}

	@Test
	public void runnableInterfaceExample(){
		System.out.println("===========================================================");

		Runnable impl = new RunnableImpl();
		Thread t = new Thread(impl);
		t.start();
		impl.run();
		
		System.out.println("===========================================================");

		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is from runnable anonymous");
				
			}
		};
		
		runnable.run();
		Thread t1 = new Thread(runnable);
		t1.start();

		
		System.out.println("===========================================================");
		
		Runnable runnable2 = () -> {
			for(int i=0; i<5; i++){
				System.out.println("runnable impl with lamda expression");
			}
		};
		runnable2.run();
		Thread t2 = new Thread(runnable2);
		t2.start();

		System.out.println("===========================================================");

		Thread t3 = new Thread(() -> {
			for(int i=0; i<5; i++){
				System.out.println("runnable impl with lamda expression");
			}
		});
		t3.start();
		
		System.out.println("===========================================================");

	}
	
	@Test(enabled = false)
	public void lamdaUsingRunnableI() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous inner type");

			}
		}).start();

		new Thread(() -> System.out.println("Anonymous inner type using lamda expression")).start();

	}
}
