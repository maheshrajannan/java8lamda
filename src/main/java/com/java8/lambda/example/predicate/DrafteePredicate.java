/**
 * 
 */
package com.java8.lambda.example.predicate;

import com.java8.lambda.example.domain.Gender;
import com.java8.lambda.example.domain.Person;

/**
 * @author maheshrajannan
 *
 */
public class DrafteePredicate implements MyPredicate<Person> {
	private static MyPredicate<Person> drafteePredicate = new DrafteePredicate();

	@Override
	public boolean test(Person p) {
		return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
	}
	
	public static MyPredicate<Person> getInstance() {
		return drafteePredicate ;
	}
}
