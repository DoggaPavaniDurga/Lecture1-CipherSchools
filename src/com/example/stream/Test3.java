package com.example.stream;

public class Test3 {
	public static void main(String[] args) {
//		ProgramOne p1 = new ProgramOne();
//		p1.add(10, 20);
//		
		
		//case 2: using lambda exp 
		mathX ob = (int x, int y)->{
			System.out.println(x+y);
		};
		ob.add(10, 20);
	}

}

interface mathX{
	void add(int x, int y);
}

//class ProgramOne implements mathX{
//
//	@Override
//	public void add(int x, int y) {
//		// TODO Auto-generated method stub
//		System.out.println(x+y);
//		
//		
//	}
//
//}
