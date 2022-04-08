package com.java.predefined.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		/* Predicate: takes the one argument and always return boolean value */
		System.out.println(" =====> Predicate: Always takes one argument as input and returns the boolean value ");
		Predicate<String> predicate = s -> s.length() > 5;
		
		/* Test it */
		System.out.println("The length of the given string Raviraj is greater than 5: " + predicate.test("Raviraj"));
		
		/* Predicate: negate() function */
		System.out.println("\n" + " =====> Predicate: negate() function");
		Predicate<String> chkLen = s -> s.length() > 5;

		/* Test it */
		System.out.println("The length of the given string Raviraj is less than 5: " + predicate.negate().test("Raviraj"));
		
		/* Predicate chaining: Joining the predicates with "and" condition */
		System.out.println("\n" + " =====> Predicate chaining: Joining the predicates with and condition ");
		Predicate<String> predicateOne = s -> s.length() > 5;
		Predicate<String> predicateTwo = s -> s.startsWith("Rav");
		
		/* Test it */
		System.out.println("The length of the given string Raviraj is greater than 5 and it starts with Rav: " 
													+ predicateOne.and(predicateTwo).test("Raviraj"));
		System.out.println("The length of the given string RandomString is greater than 5 but it not starts with Rav: " 
				+ predicateOne.and(predicateTwo).test("RandomString"));
		
		/* Predicate chaining: Joining the predicates with "or" condition */
		System.out.println("\n" + " =====> Predicate chaining: Joining the predicates with or condition ");
		Predicate<String> checkLength = s -> s.length() > 5;
		Predicate<String> checkFOrVip = s -> s.startsWith("mr.");
		
		/* Test it */
		System.out.println("The length of the given string Samartha is greater than 5 but he is not VIP person: " 
				+ checkLength.or(checkFOrVip).test("Samartha"));
		System.out.println("The length of the given string mr.X is not greater than 5 but he is a VIP person: " 
				+ checkLength.or(checkFOrVip).test("mr.X"));
		System.out.println("The length of the given string mr.Raviraj is greater than 5 but he is a VIP person: " 
				+ checkLength.or(checkFOrVip).test("mr.Raviraj"));
		
		/* Predicate: takes two arguments as input and returns the boolean value */
		System.out.println("\n" + " =====> BiPredicate: takes two arguments as input and returns the boolean value");
		BiPredicate<String, String> compareLength = (s1,s2) -> s1.length()==s2.length();
		
		/* Test it */
		System.out.println("The given strings, ravi and Somu lengths are equal: " + compareLength.test("Ravi", "Somu"));
		System.out.println("The given strings, ravi and Raghav lengths are not equal: " + compareLength.test("Ravi", "Raghav"));
		
		/* Similar way as like Predicate joining, BiPredicate joining also be done by creating multiple condition 
		 * and joining them with and, or logical operation */
	}

}
