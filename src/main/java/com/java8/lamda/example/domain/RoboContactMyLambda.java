package com.java8.lamda.example.domain;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboContactMyLambda {

  public void phoneContacts(List<Person> pl, MyPredicate<Person> aTest){
    for(Person p:pl){
      if (aTest.check(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, MyPredicate<Person> aTest){
    for(Person p:pl){
      if (aTest.check(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, MyPredicate<Person> aTest){
    for(Person p:pl){
      if (aTest.check(p)){
        roboMail(p);
      }
    }
  }  
  
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
  }
  
}
