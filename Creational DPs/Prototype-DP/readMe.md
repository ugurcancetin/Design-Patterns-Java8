# Prototype Design Pattern #

Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations. The existing object acts as a prototype and contains the state of the object. The newly copied object may change same properties only if required. This approach saves costly resources and time, especially when the object creation is a heavy process.

The prototype pattern is a creational design pattern. Prototype patterns is required, when object creation is time consuming, and costly operation, so we create object with existing object itself. One of the best available way to create object from existing objects are clone() method. Clone is the simplest approach to implement prototype pattern. However, it is your call to decide how to copy existing object based on your business model.

* Prototype : This is the prototype of actual object.

* Prototype registry : This is used as registry service to have all prototypes accessible using simple string parameters.

* Client : Client will be responsible for using registry service to access prototype instances.

When to use the Prototype Design Pattern

When a system should be independent of how its products are created, composed, and represented and
When the classes to instantiate are specified at run-time.

For example,
* By dynamic loading or To avoid building a class hierarchy of factories that parallels the class hierarchy of products or

* When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.

## Concepts

* Avoids costly creation
* Avoids subclassing
* Typically doesn't use "new"
* Often utilizes an Interface
* Usually implemented with a Registry
* Example: java.lang.Object#clone()

## Implementation Considerations
 * Pay attention to the deep copy and shallow copy of references. Immutable fields on clones save the trouble of deep copy.
 * Make sure to reset the mutable state of object before returning the prototype. It's good idea to implement this in the method to allow subclasses to initialize themselves. reset and initialize methods in sample project1.
 * clone() method is protected in Object class and must be overridden to be public to callable from outside of the class.
 * Clonable is a "marker" interface, an indication that the class supports cloning.
 
 ## Pitfalls
 
 * Usability depends upon the number of properties in state that are immutable or can be shallow copied. An object where state is comprised of large number of mutable object is complicated to clone.
 * In Java the default clone operation will only perform the shallow copy so if you need a deep copy, you have to implement it.
 * Subclasses may not be able to support clone and so the code becomes complicated as you have to code for the situations where an implementation may not suppor clone.
 
 
 ## UML Diagram for Prototype

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Creational%20DPs/Prototype-DP/prototype-2.PNG)
