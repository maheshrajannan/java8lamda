package com.java8.lambda.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maheshrajannan
 */
public class RoboContactMyLambda {

	public List<Person> phoneContacts(List<Person> people, MyPredicate<Person> aTest) {
		List<Person> phoned = new ArrayList<>();
		for (Person person : people) {
			if (aTest.test(person)) {
				phoned.add(roboCall(person));
			}
		}
		return phoned;
	}

	public List<Person> emailContacts(List<Person> people, MyPredicate<Person> aTest) {
		List<Person> emailed = new ArrayList<>();
		for (Person person : people) {
			if (aTest.test(person)) {
				emailed.add(roboEmail(person));
			}
		}
		return emailed;
	}

	public List<Person> mailContacts(List<Person> people, MyPredicate<Person> aTest) {
		List<Person> mailed = new ArrayList<>();
		for (Person person : people) {
			if (aTest.test(person)) {
				mailed.add(roboMail(person));
			}
		}
		return mailed;
	}

	public Person roboCall(Person person) {
		System.out.println("Calling " + person.getGivenName() + " " + person.getSurName() + " age " + person.getAge()
				+ " at " + person.getPhone());
		return person;
	}

	public Person roboEmail(Person person) {
		System.out.println("EMailing " + person.getGivenName() + " " + person.getSurName() + " age " + person.getAge()
				+ " at " + person.getEmail());
		return person;
	}

	public Person roboMail(Person person) {
		System.out.println("Mailing " + person.getGivenName() + " " + person.getSurName() + " age " + person.getAge()
				+ " at " + person.getAddress());
		return person;
	}

}
