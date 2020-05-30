Design Pattern:-
 are common architectural approaches..
 are reusable solution to commonly occurring problem
 -----------------------------------------------------------------------------------------------------------------------------------
 SOLID Principles
  Set of design principles
  S:- Single Responsibility:- Class should have single responsibility or handle single responsibility. 
  		A class should have only one reason to change or separation of concerns
  O:- Open Close:- Open for extension and close for modification. Should avoid modifying which was already tested
  L:- Liskov Substitution :- Defines Object Superclass should be replaceable with object of subclass without breaking the object
                           and it requires subclass should behave same way like superclass
  I:- Interface segregation :- split larger interfaces into smaller interfaces with specific to client requirement
  D:- Dependency Inversion :-High level module should not depends on low level modules. they should depends on abstraction
  							 Abstraction should not depends on details but details should depends on abstraction
  							 
-----------------------------------------------------------------------------------------------------------------------------------

Design patterns categories
1) Creational patterns
	- Deal with the creation of objects
2) Structural pattern
   - Concerned with Structure (e.g class members) inheritance or composition
   - wrapper that mimic the underlying class interface
3) Behavior pattern
   - Better interaction between the objects. loose coupling and flexibility
   
 Creational Patterns:-
   1) Builder:- Complex or having more member variables objects can be created step by step through api.
               creating the object step by step and a method finally get the object instance
               
               JDK Inbuild classes:- StringBuilder
   2) Factory Pattern:- creates objects without exposing the instantiation logic to the client.
			refers to the newly created object through a common interface
	 Abstract factory
			
   3) Prototype:- Creating objects using existing object (clone)
       partially or fully initialized object that we can clone and make use of it..
       Can be created objects through Cloneable Copy Constructor and serialization
   4) Singleton:- Component which is instantiated only once
   			Reflection
   			Cloneable
   			Inner static class
   			Serialization --> readResolve()
               
 Structural Patterns:-
  1) Adapter:- allow 2 incompatible classes to work together by wrapping an interface around one of existing classes
  2) Bridge :- Connect component through abstraction
  			   Mechanism that decouples an interfaces from implementation
  			   Prevent cartesion of interfaces or components
  3) Composition :- Group of objects into a single object.e.g Tree structure. Employee hierarchy
  4) Decorator:- Open close principle
              Add extra features to existing classes without modifying the other instances of class
              Attach additional responsibilities to an object dynamically.
               Decorators provide a flexible alternative to subclassing for extending functionality.
  5) Facade:- Exposing serveral components through single component or interface to make things convenient to end user
  				Provides a simple interface to a more complex underlying object.
  6) Flyweight:- Caching or reusing objects eg. StringPool
  				Primary purpose of pattern to reduce number of objects to reduce memory footprint and increase the performance
  				Instrinsic state is shared and extinsic state is computed by client
  7) Proxy :- Provides placeholder to another object to control access of it.. 
  			common use of proxy to reduce the cost of object creation and it can be called when really user needs it..
   			Type of Proxy
   			i) Protection :- Control the access of real object
   			ii) Remote :- Control the actual object running on remote JVM
   			iii) Smart reference :- Perform additional action on real object like reference count or caching..
   			
 Behavior Pattern:-
 
 1) Chain of resposibilities:-Creates chain of receiving objects for request chain
   							used to achieve loose coupling in soft design where request of client is 
   							passed to chain of objects to process them
   				java.util.logging.Logger#log()
				javax.servlet.Filter#doFilter()
 2) command :- Creates an object that encapsulates action and parameters
 			A request can be wrapped under a object and passed to Invoker.. 
 			Invoker object will look for appropriate handler and execute the commnad
 			e.g Runnable interface
 3) Interpreter Pattern:- Interpreter pattern provides a way to evaluate language grammar or expression.
 			e.g java.text.Format, java.util.pattern
 4) Iterator Pattern:- the way to access the element of collection without knowing the underlying representation
 5) Mediator Pattern:- Facilities a communication between compoenents
 				used to provide a centralized communication medium between different objects in a system. 
 			e.g chat room 	
 			e.g Front controller aka Dispatcher Servlet in sprin mvc acts as mediator between web request, 
 			controller and view object
 6) Memento :- Provides a ability to restore object from previous state
 			used when we want to save the state of an object so that we can restore later on.
 			e.g:- Serialization
 7) NullObject :- Pattern with no behavior
 				NullObject pattern null check of object is replaced with Null Object.
 				Null Object reflects as a do nothing
 8) Observer :- Its a publish subscribe model. Dependent Objects need to be notified
 			java.util.EventListener
 			javax.servlet.http.HttpSessionBindingListener
 9) Sate:- Its the state of object Or state of object changes due to internal changes
 			eg Light Switch can be on or off state
 10) Strategy:- Allows one of a family of algorithms to be selected on-the-fly at run-time.
 			e.g:- 
  
               
               
               