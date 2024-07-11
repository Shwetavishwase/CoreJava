package com.csi.exceptioncore;

import java.io.IOException;

class Dept{
	
	void get() throws IOException{
		
	}
	
}

class Emp extends Dept{
	
	void get() throws ArithmeticException{
		
	}
}
public class CoreException {

	public static void main(String[] args) {

		try {
			int res = 10 / 0;

			System.out.println(res);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Always execute");
		}
	}
}
