# Bridge Design Pattern

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies — abstraction and implementation — which can be developed independently of each other.

## Summary

* Our implementations & abstractions are generally coupled in normal inheritance. 
* Using bridge design pattern we can de-couple them so they can change without effecting each other.
* We achieve this feat by creating two seperate inheritance hierachies: one for implementation and ohter one is for abstraction.
* We use Composition to bridge these two hierarchies.

## During Implementation

* Start by defining abstraction as needed by client.
    * Determine common base operations and define them in abstraction.
    * Define the implementor next. Implementor methods do not have to match with abstractor.
    * Write one or more concrete implementor providing implementation
* Abstractions are created by composing them with an instance of concrete implementor which is used by methods in abstractions.