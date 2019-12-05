# What is Decorator ?

* When we want to enhance behaviour of our existing object dynamically as and when required then, we can use decorator as design pattern.
* Decorator wraps an object within itself and provides same interface as the wrapped object. So the client of original object does not need to change.
* A decorator provides alternative to subclassing for extending functionality of existing classes.

## Implementation Steps

* We start with our component.
    * Component defines interface needed or already used by client.
    * Concrete component implements the component.
    * We define our decorator. Decorator implements component & also needs reference to concrete component.
    * In decorator methods we provide additional behaviour on top that provided by concrete component instance.
* Decorator can be abstract as well & depend on subclasses to provided functionality.

## Implementation Considerations

* Since we have decorators and concrete classes extending from common component avoid large state in this base class as decorators may not need all that state.
* Pay attention to equals and hashCode methods of decorator. When using decorators, you have to decide if decorated object is equal to same instance without decorator.
* Decorators support recursive composition and so this pattern lends itself to creation of lots of small objects that add "just a little bit functionality". Code using these objects become difficult to debug.

## Design Considerations

* Decorators are more flexible & powerful than inheritance. Inheritance is static by definition but decorators allow you to dynamically compose behaviour using objects at runtime.
* Decorators should act like additional skin over your object. They should add helpful small behaviours to object's original behaviour. Do not change meaning of operations.

## Decorator Pattern UML Diagram

![Decorator UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Structural%20DPs/Decorator-DP/decorator.PNG)

