/**
 * 
 */
package com.java8.lambda.example.domain;

/**
 * @author maheshrajannan
 *
 */
public class PilotPredicate implements MyPredicate<Person> {
	
	private static PilotPredicate pilotPredicate = new PilotPredicate();

    @Override
    public boolean test(Person p){
      return p.getAge() >= 23 && p.getAge() <= 65;
    }
    
    public static MyPredicate<Person> getInstance() {
    	return pilotPredicate;
    }
    
  }