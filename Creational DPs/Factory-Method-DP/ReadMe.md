# Factory Method Pattern

A Factory Pattern or Factory Method Pattern says that __just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.__ In other words, subclasses are responsible to create the instance of the class.

The Factory Method Pattern is also known as Virtual Constructor.

With other words, Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.

## Concepts

* Does not expose instantiation logic
* Common interface
* Specified by architecture, implemented by user

## Advantage of Factory Design Pattern

Factory Method Pattern allows the sub-classes to choose the type of objects to create. It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.

## Usage of Factory Design Pattern

* When a class doesn't know what sub-classes will be required to create
* When a class wants that its sub-classes specify the objects to be created.
* When the parent classes choose the creation of objects to its sub-classes.

## Examples:
* Calendar
* ResourceBundle
* NumberFormat

## UML for Factory Method Pattern

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Creational%20DPs/Factory-Method-DP/factory-method-dp.PNG)
