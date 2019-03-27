# Builder Design Patter

If you consider applying design patter in your code, consider if your object is having

## Complex constructor

Can be the situation that your object needs complex nested parameters to be constructed.

## Many Parameters 

Your object/class may depend on large number of field parameters.

## Immutability

It might be your need also forcing the immutability to the object once creation phase is done.

- - - - 
If you have these reasons, builder desing patter can be good choice to choose. But surely, further conditions can be considered before applying this pattern as well.
It typically solve problem in object oriented programming i.e determining what constructor to use. Often we write many constructor and it is really hard to manage them. The multiple constructor with combination of multiple parameters variation is called the telescoping constructor.

## Examples In Java World
  * StringBuilder
  * DocumentBuilder
  * Locale.Builder
