package com.java8.lambda.example.domain;

import java.util.List;

/**
 * @author MikeW
 */
public class RoboMyLambdaTest {

  public static void main(String[] args) {
    
    List<Person> pl = PersonCreator.createShortList();
    RoboContactMyLambda robo = new RoboContactMyLambda();
    
    System.out.println("\n==== Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    /**
     * Moving to separate predicates for easy testability.
     */
    robo.phoneContacts(pl, DriverPredicate.getInstance());
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl,DrafteePredicate.getInstance());
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl,PilotPredicate.getInstance());
    
    
  }
}
