## What is an Object Pool? 

Most of the time, performance is the key issue during the software development and the object creation, which may be a costly step.

Object Pool Pattern says that " to reuse the object that are expensive to create".

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.

### When To Use ?
   * In our system if cost of creating an instance of a class is high and we need a large number of objects of this class for short duration, then we can use an object pool.
   * Here we either pre-create objects of the class or collect unused instances in an in memory cache. When code needs an object of this class, we provide it from this cache.
   * One of the most complicated pattern to implement efficiently.(without defects)

## Compare & Constrast with Prototype

Object Pool  | Prototype
------------- | -------------
We have cached objects that frequently live throughout programs entire run.  | Prototype creates object when needed and no cahcing is done.
Code using objects from object pool has to return the objects explicitly to pool. Depending on implementation, failing to return to pool may lead to memory and/or resour leak.  | Once an object is cloned no special treatment is needed by the client code and object can be used like any regular object.

## Pitfalls
* Succesful implementation depends on correct use by the client code. Releasing object back to pool can be vital for correct way of working.
* The reusable object needs to take care of resetting its state in efficient way. Some objects may not be suitable for pooling due to this requirement.
* Difficult to use in refactoring legacy code as the client code * reusable object both need to be aware of object pool.
* You have to decide what happens when pool is empty and there is a demand for an object. You can either wait for an object to become free or create new objects. Both have option issues. Waiting can have severe negative impact on performance.

## UML for Object Pool Pattern

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Creational%20DPs/Object-Pool-DP/Object-Pool.PNG)
