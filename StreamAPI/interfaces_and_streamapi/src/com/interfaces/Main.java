package com.interfaces;

class A{
	public void m1(String s1)
	{
		System.out.println("hii");
	}
	
	public void m1(Object o)
	{
		System.out.println("Object");
	}

}
public class Main{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1(null);
		
	}
}
