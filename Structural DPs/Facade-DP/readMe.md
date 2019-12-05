# What is Facade ? 

* Client has to interact with a large number of interfaces and classes in a subsystem to get result.
So Client gets tightly coupled with those interface & classes. Facade solves this problem.
* Facade provides a simple and unified interface to subsystem. Client interacts with just the facade now to get same result.
* Facade is NOT just a one to one method forwarding to other classes.

# Implement a Facade

* We start by creating a class that will ser as a facade
    * We determine the overall "use cases"/tasks that the subsystem is used for.
    * We write a method that exposes each "use case" or task.
    * This method takes care of working with different classes of sybsystem.

# Implementation Considerations

* A facade should minimize the complexity of subsystem and provide usable interface.
* You can have an interface or abstract class for facade and client can use different subclasses to talk to different subsystem implementations.
* A facade is not replacement for regular usage of classes in subsystem. Those can be still used outside of facade.
Your subsystem class implementations should not make assumptions of usage of facade by client code.

# Compare & Contrast with Adapter

Facade  | Adapter
------------- | -------------
Intent is to simplify the usage of subsystem for client code. | Adapter is meant to simply adapt an object to different interface.
facade is not restricted by any existing interface. It often defines simple methods which handle complex interactions behind scenes. | Adapter is always written to a particular interface expected by client code. It has to implement all the methods from interface and adapt them using existing object.

# Pitfalls

* Not a pitfall of the pattern itself but needing a facade in a new design should warrant another look at API design.
* It is often overused or misused pattern & can hide improperly designed API. A common misuse is to use them as "containers of related methods". So be on the lookout for such cases during code reviews.

# Facade UML Diagram

![Facade UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Structural%20DPs/Facade-DP/Facade.PNG)
