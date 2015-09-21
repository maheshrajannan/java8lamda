/**
 * 
 */
package com.java8.lambda.example.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.java8.lambda.example.predicate.DrafteePredicate;
import com.java8.lambda.example.predicate.DriverPredicate;
import com.java8.lambda.example.predicate.MyPredicate;
import com.java8.lambda.example.predicate.PilotPredicate;

/**
 * @author maheshrajannan
 *
 */
public class RoboContactMyLambdaTest {
	List<Person> people = new ArrayList<Person>();
	RoboContactMyLambda robo = null;
	private MyPredicate<Person> driverPredicate;
	private MyPredicate<Person> drafteePredicate;
	private MyPredicate<Person> pilotPredicate;

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
	    robo = new RoboContactMyLambda();
	    /**
	     * Custom predicates...really Generic Classes much easier and more re-usable.
	     */
	    driverPredicate = DriverPredicate.getInstance();
	    drafteePredicate = DrafteePredicate.getInstance();
	    pilotPredicate = PilotPredicate.getInstance();
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
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactMyLambda#phoneContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
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
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactMyLambda#emailContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
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
	 * Test method for {@link com.java8.lambda.example.domain.RoboContactMyLambda#mailContacts(java.util.List, com.java8.lambda.example.predicate.MyPredicate)}.
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
