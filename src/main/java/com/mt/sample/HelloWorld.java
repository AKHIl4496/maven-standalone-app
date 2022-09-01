package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello De DevOps Engineers, Welcome to Anu Technologies DevOps Master Class. You are using Maven Build Tool. !! Today Date is:  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "Anu Technologies";
		return new Date();

	}

}
