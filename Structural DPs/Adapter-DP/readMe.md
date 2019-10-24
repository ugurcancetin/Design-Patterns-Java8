# What is Adapter ? 

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. It's usually implemented once the application is designed.

## Steps to Identfy IF NEEDED ?

* we have an existing object which provides the functionality that client needs. But the client code can't use this object because it expects an object with a different interface.
* Using adapter design pattern we make this existing object work with client by adapting the object to client's expected interface.
* This pattern is also called as wrapper as it "wraps" existing object.

## Implementation Considerations

* How much work the adapter does depends upon the difference between target interface and object being adapted. If method arguments are same or similar adapter has very less work to do.
* Using class adapter "allows" you to override some of the adaptee;s behaviour. But this has to be avoided as you end up with adapter that behaves differently than adaptee. Fixing defects is not easy anymore!!
* Using object adapter allows you to potentially change the adaptee object to one of its subclasses.
* In java a "class adapter" may not be possible if both target and adaptee are concrete classes. In such cases the object adapter is the only solution. Also since there is private inheritance in Java, it's better to stick with object adapter.
* A class adapter is also called as a two way adapter, since it can stand in for both tge target interface and for the adaptee. That's we can use object of adapter where either target interface is expected as well as where an adaptee object is expected.

## Compare & Contrast with Decorator

Adapter  | Decorator
------------- | -------------
Simply adapts an object to another interface without changing behaviour. | Enhances object behaviour without changing its interface.
Not easy to use recursive composition, that is an adapter adapting another adapter since adapters change interface. | Since decorators do not change the interface, we can do recursive composition or in other words decorate a decorator with ease. Since a decorator is indistinguishable from main object.

## Pitfalls

* Using target interface and adaptee class to extend our adapter we can create a "class adapter" in java. However it creates an object which exposes unrelated methods in parts of your code, polluting it. Avoid class adapter. It's mentioned in the examples only for sake of completeness.
* It is tempting to do a lot of things in adapter besides simple interface translation. But this can result in an adapter showing different behaviour than the adapted object.
* Not a lot of other pitfalls! As long as we keep them true to their purpose of simple interface translation they are good.

## Adapter Pattern UML Diagram

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Structural%20DPs/Adapter-DP/adapter-dp.PNG)
