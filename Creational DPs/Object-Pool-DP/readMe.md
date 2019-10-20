## What is an Object Pool? 

Most of the time, performance is the key issue during the software development and the object creation, which may be a costly step.

Object Pool Pattern says that " to reuse the object that are expensive to create".

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.

### When To Use ?
   * In our system if cost of creating an instance of a class is high and we need a large number of objects of this class for short duration, then we can use an object pool.
   * Here we either pre-create objects of the class or collect unused instances in an in memory cache. When code needs an object of this class, we provide it from this cache.
   * One of the most complicated pattern to implement efficiently.(without defects)
   
   
## UML for Object Pool Pattern

![Factory Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Creational%20DPs/Object-Pool-DP/Object-Pool.PNG)
