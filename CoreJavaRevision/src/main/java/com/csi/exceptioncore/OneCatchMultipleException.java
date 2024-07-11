package com.csi.exceptioncore;

import java.io.IOException;

public class OneCatchMultipleException {

	public static void main(String[] args) {
		
		//from JDK 1.7 ,Pipe operator by which we can add multiple exception in one catch
		
		try {
			int res=10/0;
			
			System.out.println(res);
		}
		catch (ArithmeticException  | NullPointerException |ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
