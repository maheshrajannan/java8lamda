/**
 * 
 */
package com.java8.lambda.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author maheshrajannan
 *
 */
public class RoboContactLambdaTest {
	List<Person> people = new ArrayList<Person>();
	RoboContactLambda robo = null;
	private Predicate<Person> driverPredicate;
	private Predicate<Person> drafteePredicate;
	private Predicate<Person> pilotPredicate;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	    people = PersonCreator.createShortList();
	    robo = new RoboContactLambda();
	    // Predicates.
	    //INFO: Predicate is nothing but
	    //a generic class(precisely functional interface) of Type <T>,
	    //The class in itself is tailored for an expression that evaluates to true or false.
	    //INFO: the age checks are not re-usable. They are repeated.
	    driverPredicate = p -> p.getAge() >= 16;
	    drafteePredicate = p -> p.getAge() >= 18
	    		&& p.getAge() <= 25 && p.getGender() == Gender.MALE;
	    pilotPredicate = p -> p.getAge() >= 23 && p.getAge() <= 65;	    
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		people.clear();
		robo = null;
	}

	/**
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactLambda#phoneContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
	 */
	@Test
	public final void testPhoneContacts() {
	    List<Person>
	    drivers = robo.phoneContacts(people, driverPredicate);
	    for(Person driver:drivers) {
	    	Assert.assertTrue("Phoned is not a driver",
	    			driverPredicate.test(driver));
	    	;
	    }
	}

	/**
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactLambda#emailContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
	 */
	@Test
	public final void testEmailContacts() {
	    List<Person>
	    draftees = robo.emailContacts(people, drafteePredicate);
	    for(Person driver:draftees) {
	    	Assert.assertTrue("emailed is not a driver",
	    			drafteePredicate.test(driver));
	    	;
	    }
	}

	/**
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactLambda#mailContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
	 */
	@Test
	public final void testMailContacts() {
	    List<Person>
	    pilots = robo.mailContacts(people, pilotPredicate);
	    for(Person driver:pilots) {
	    	Assert.assertTrue("emailed is not a driver",
	    			pilotPredicate.test(driver));
	    	;
	    }
	}

}
