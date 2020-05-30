package com.study.dp.creation.pattern;

import java.io.Serializable;

class NewAddress implements Serializable
{
  public String streetNewAddress, city, country;

  public NewAddress(String streetNewAddress, String city, String country)
  {
    this.streetNewAddress = streetNewAddress;
    this.city = city;
    this.country = country;
  }

  public NewAddress(NewAddress other)
  {
    this(other.streetNewAddress, other.city, other.country);
  }

  @Override
  public String toString()
  {
    return "NewAddress{" +
      "streetNewAddress='" + streetNewAddress + '\'' +
      ", city='" + city + '\'' +
      ", country='" + country + '\'' +
      '}';
  }
}

class Employee implements Serializable
{
  public String name;
  public NewAddress NewAddress;

  public Employee(String name, NewAddress NewAddress)
  {
    this.name = name;
    this.NewAddress = NewAddress;
  }

  public Employee(Employee other)
  {
    name = other.name;
    NewAddress = new NewAddress(other.NewAddress);
  }

  @Override
  public String toString()
  {
    return "Employee{" +
      "name='" + name + '\'' +
      ", NewAddress=" + NewAddress +
      '}';
  }
}


public class PrototypeCopyConstuctor {
	 public static void main(String[] args)
	  {
	    Employee john = new Employee("John",
	      new NewAddress("123 London Road", "London", "UK"));

	    //Employee chris = john;
	    Employee chris = new Employee(john);

	    chris.name = "Chris";
	    System.out.println(john);
	    System.out.println(chris);
	  }
}
