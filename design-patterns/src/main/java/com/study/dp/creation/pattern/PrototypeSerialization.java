package com.study.dp.creation.pattern;

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeSerialization {

	public static void main(String[] args) {
		//NewAddress address = new NewAddress("Downing St 10", "London", "England");

	    Employee john = new Employee("John",
	      new NewAddress("123 London Road", "London", "UK"));

	    //Employee chris = john;
	    Employee chris =(Employee)SerializationUtils.clone(john);

	    chris.name = "Chris";
	    System.out.println(john);
	    System.out.println(chris);	  
	}
}
