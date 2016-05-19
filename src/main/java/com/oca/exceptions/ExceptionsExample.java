package com.oca.exceptions;

import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.NullPointerException;


/**
 * @author mcrassin
 * @since 19/05/2016
 */
public class ExceptionsExample {
	
	/**
	 * example 1: finally is always done, even after a value has been return in the try. 
	 */
	public int complexTreatment1() {		
		try {	// protected code
			return 0;
			
		} catch (NullPointerException e) {
			return 1;
			
		} finally {
			return 2;
		}
		//return 3;	unreachable statement
	}
	
	/**
	 * Example 2: finally is always executed and can mask exceptions by returning a value anyway.
	 * 		if we remove the catch block, the same logic will apply: finally will return 2 anyway, even with the NullPointerException.
	 */
	public int complexTreatment2() {		
		String str = null;
		try {
			str.length();	// throws NullPointerException
			return 0;
			
		} catch (NullPointerException e /*RuntimeException*/) {	// catch it
			throw new Exception("exception thrown from catch block.");
			
		} finally {	// execute finally anyway, return 2, as if no exeption were thrown. THROW NEW EXCEPTION IS IGNORED.
			return 2;
		}
		//return 3;	unreachable statement
	}	 
	
	/**
	 * Example 3: hiding RuntimeException thrown in the catch by the one in the finally. 
	 */
	public int complexTreatment3() {		
		String str = null;
		try {
			System.out.println("try");
			str.length();	// throws NullPointerException
			
		} catch (NullPointerException e /*RuntimeException*/) {	// catch it
			System.out.println("catch");
			throw new RuntimeException("exception thrown from catch block.");
			
		} finally {	// execute finally anyway, throw another exception. THROW NEW EXCEPTION IN CATCH IS IGNORED.
			System.out.println("finally");
			throw new RuntimeException("exception thrown from finally block.");
		}
	}	 
	
	/**
	 * Example 4: exit() function is the only exception to the finally rule. A call tp this function stop the program and block the finally
	 *		block from ever being executed.
	 */
	public int complexTreatment4() {
		try {
			System.out.println("try");	// executed
			System.exit(0);
			
		} catch (NullPointerException e /*RuntimeException*/) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");	// not executed
		}
		return 0;
	}

	public static void main(String... args) {
		ExceptionsExample exceptionExample = new ExceptionsExample();
		
		System.out.println("complexTreatment1 call ...");
		int result = exceptionExample.complexTreatment1();	
		System.out.println("complexTreatment1 call done with " + result);
		
		System.out.println("complexTreatment2 call ...");
		result = exceptionExample.complexTreatment2();	
		System.out.println("complexTreatment2 call done with " + result);
		
		System.out.println("complexTreatment3 call ...");
		try{
		result = exceptionExample.complexTreatment3();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("complexTreatment3 call done with " + result);
		
		System.out.println("complexTreatment4 call ...");
		result = exceptionExample.complexTreatment4();	
		System.out.println("complexTreatment4 call done with " + result);
	}
}
