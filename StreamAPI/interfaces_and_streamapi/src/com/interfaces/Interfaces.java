package com.interfaces;

public interface Interfaces {
		public void m1() ;
		public void m2();
		public void m3();
		default void m4()
		{
			System.out.print("m4 from a");
		}
	}

	class B implements Interfaces{

		public void m1() {
			System.out.print("m1 method ");
			
		}

		@Override
		public void m2() {
			System.out.print("m2 method ");
			
		}

		@Override
		public void m3() {
			System.out.print("m3 method ");	
		}
	}

	class c implements Interfaces{
		
		@Override
		public void m4() {
			// TODO Auto-generated method stub
			Interfaces.super.m4();
		}

		public void m1()
		{
			System.out.print("m1 method of c ");	
		}

		@Override
		public void m2() {
			System.out.print("m2 method of c ");	
		}

		@Override
		public void m3() {
			System.out.print("m3 method of c ");	
			
		}
		
	}
	
class D {
	public static void main(String args[])
	{
		
		Interfaces a = new Interfaces() {
				

					@Override
					public void m1() {
					}

					@Override
					public void m2() {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void m3() {
						// TODO Auto-generated method stub
						
					}
			
				};
				a.m4();
	}
}
				

