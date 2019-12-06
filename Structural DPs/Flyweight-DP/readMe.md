# What is Flyweight ?

* Our system needs a large number of objects of a particular class & maintaining these instances is a performance concern.
* Flyweight allows us to share an object in multiple context. Byt instead of sharing entire object, which may not be feasible, we divide object state in two parts:
    * Intrinsic ( state that is shared in every context )
    * Extrinsic ( context specific state )
* We create objects with only intrinsic state and share them in multiple context.
* Client or user of object provides the extrinsic state to object to carry out its functionality.

# Implement a Flyweight 

* We start by identifying "intrinsic" & "extrinsic" state of our object.
    * We create an interface for flyweight to provide common methods that accept extrinsic state.
    * In implementation of shared flyweight we add intrinsic state & also implement methods.
    * In unshared flyweight implementation we simply ignore the extrinsic state argument as we have all state within object.
* Next we implement the flyweight factory which caches flyweights & also provides method to get them.

# Implementation Consideration

* A factory is necessary with flyweight design pattern as client code needs easy way to get hold of shared flyweight.
Also number of shared instances can be large so a central place is good strategy to keep track of all of them.
* Flyweight's intrinsic state should be immutable for successful use of flyweight pattern.

# Design Consideration
* Usability of flyweight is entirely dependent upon presence of sensible extrinsic state in object which can be moved out of object without any issue.
* Some other design paterns like state and strategy can make best use of flyweight pattern.

# Comparison 

Flyweight | Object pool
------------- | -------------
State of flyweight object is divided. Client must provide part of state to it. | A pooled object all of its state encapsulated within itself.
In typical usage, client will not change intrinsic state of flyweight instance as it is shared. | Clients can and will change state of pooled objects.

# Pitfalls

* Runtime cost may be added for maintaining extrinsic state. Client code has to either maintain it or compute it every time it needs to use flyweight.
* It is often difficult to find perfect candidate objects for flyweight. Graphical applications benefit heavily from this pattern however a typical web application may not have a lot of use for this pattern.