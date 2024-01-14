package com.springboot;

public class Car extends Engine{
	public void drive() {
		int status= super.start();
		
		if (status >=1) {
			System.out.println("Your Jourrny is Start ..!");
		} else {
			System.out.println("Some  is Problem ... ?");
		}
	}
}
