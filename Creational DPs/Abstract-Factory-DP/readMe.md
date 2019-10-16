# Abstract Factory Design Pattern #

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

* AbstractFactory  : Declares an interface for operations that create abstract product objects.

* ConcreteFactory  registry : Implements the operations declared in the AbstractFactory to create concrete product objects.

* Product : Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.

* Client : Uses only interfaces declared by AbstractFactory and AbstractProduct classes.

Abstract Factory provides interfaces for creating families of related or dependent objects without specifying their concrete classes.

Client software creates a concrete implementation of the abstract factory and then uses the generic interfaces to create the concrete objects that are part of the family of objects.
The client does not know or care which concrete objects it gets from each of these concrete factories since it uses only the generic interfaces of their products.

So with this idea of Abstract Factory pattern, we will now try to create a design that will facilitate the creation of related objects.

## Implementation of Abstract Factory

* We start by studying the product sets
  * Create abstract factory as an abstract class or an interface
  * Abstract factory defines abstract methods for creating products
  * Provide concrete implementation of factory for each set of products 
* Abstract factory makes use of factory method pattern. You can think of abstract factory as an object with multiple factory methods...
* Factories can be implemented as singletons, we typically ever need only one instance of it anyway. But make sure to familiarize yourself with drawbacks of singletons.
* Adding a new product type changes to the base factory as well as all implementations of factory.
* We provide the client code with concrete factory so that it can create objects.

## Concepts

* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses
* Example: DocumentBuilder

## Compare & Contrast With Factory Method

Abstract Factor  | Factory method
------------- | -------------
Hides factories as well as concrete objects used from the client code | Hides the concrete objects which are used from the client code.
Suitable when multiple objects are designed to work together & client must be use products from single family at a time  | Concerned with one product & its subclasses. Collaboration of product itself with other objects are irrelevant.

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Creational%20DPs/Abstract-Factory-DP/abstract-factory.PNG)
