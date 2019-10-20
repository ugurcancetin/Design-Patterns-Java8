## What is Adapter ? 

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. It's usually implemented once the application is designed.

With bullet points

* we have an existing object which provides the functionality that client needs. But the client code can't use this object because it expects an object with a different interface.
* Using adapter design pattern we make this existing object work with client by adapting the object to client's expected interface.
* This pattern is also called as wrapper as it "wraps" existing object.

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Structural%20DPs/Adapter-DP/adapter-dp.PNG)
