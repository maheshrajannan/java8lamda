package com.java8.lamda.example.domain;

import java.util.List;

/**
 * @author MikeW
 */
public class RoboCallTest03 {

  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboContactMyLambda robo = new RoboContactMyLambda();
    
    System.out.println("\n==== Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, 
        new MyPredicate<Person>(){
          @Override
          public boolean check(Person p){
            return p.getAge() >=16;
          }
        }
    );
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, 
        new MyPredicate<Person>(){
          @Override
          public boolean check(Person p){
            return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
          }
        }
    );
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, 
        new MyPredicate<Person>(){
          @Override
          public boolean check(Person p){
            return p.getAge() >= 23 && p.getAge() <= 65;
          }
        }
    );
    
    
  }
}
