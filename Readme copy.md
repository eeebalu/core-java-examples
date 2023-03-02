
# Naming convensions
## Java naming convenstions
* We following Camel case in Java
* Class and inteface - Calc, Runnable
* Variables and Method names - marks, show(), showMyMarks()
* Constatns - PIE, BRAND, MY_DATA
### Examples
* Human() - constructor
* age - variable
* MY_DATE - constant
## Anonimous objects
```
new A(); //Ananimous object there is no reference so we can't reuse them.
```
## Inheritance
* is, has
* Use the features of super class
* Java supports multi level inheritance A -> B -> C
* Java don't support multiple inheritance C -> A, C -> B. C extends A, B
* Method Overriding: Child class have same method definition as parent method then it is called method Over riding

## Polymorphism
* Compile time polymorphism - method overloading, example add(int x, int y), add(float x, float y)
* Run time polymorphism - method overriding, example same method signature with overriding: This is also called dynamic method dispatch

## final keyword
* final variable - Example: final int num = 8; // The value of the final variable a not be changed.

## Type casting
* Up casting
* Down casting

## Abstract class
* If a class has at least one abstract method we need to make the class as Abstract
* We can't create object of abstract class, however we can create reference of abstract class
* The class extends abstract class should define the abstract method


## Inner class
* Inner class object can be using outer class object
* Inner static class can be directly used using outer class
* Ananomous inner class 

## Interface
* All methods in interface are by default "public abstract"
* All variables by default "final static"
* class: class - class -> extends
* class: class - interface -> implements
* Interface: interface - interface -> extends
* Type of interfaces: Normal, FunctionaInterface (SAM), MarkerInterface
* Normal interface will have multiple methods
* SAM - Single Abstract method and can be called as FunctionalInterface
* MarkerInterface - interface without any methods but have some variables
* Serialization - to store the object into memeory
* Deserialization - to restore the objects from memory
* Runable, Throwable, Serializable - The term ends with "able" are usually Interfaces.

## Enums
* Named constants can be represted as Enums
* Enums are kind of classes and constasts in it can be treaed as objects
* The objects in Enums are assign with ordinal (numbers)
* Enum can not extend
* Enum can have constructors, method like general Java Class
* By default enum extends from Enum class (special class)

## Annotations
* It is difficult to deal with logical problems (identifying the bugs)
* Use annltations, we can identify the bugs durig compile time. Example @Override
* Annotations can be at the variables, method or class level. Example: @Deprecated, @FunctionalInterface, @IgnoreWarnings
* Annotations are at the compile level and run time level (compipler checks both at compile time and runtime).

# Java 8 new features
* No more verbose
* Lambda expressions
* FunctionalInterface - with only one method

## Lambda expressions
* Less files to manage
* Enables functional style of programming
* Lambda expression can be passed as argument to a method and it is used in collections
* Lambda expression works only with FunctionalInterface

## FunctionalInterface
* interface should have only one method declaration if we use @FunctionalInterface

## Exceptions
* Errors - compile time error, Runtime error, Logical error
* Compiletime errors - typo or syntax errors
* Runtime errors - The code exeuction will stop working due to some run time errors. Example if the java trying to open file if the file is not there.
* Logic errors - The logic is not working, the output is getting wrong (bugs). These problems are difficult to solve. Write test cases and use annotations
* Exceptions allow Runtime errors to handle gracefully and continue execution. 
* We can handle the exceptions
* Runtime exceptions are unchecked exception. There is no need to handle them. Example: ArithmaticException, NullPointerException, etc.
* Checked exceptions, the developer need to handle. Example: SQLException, IOException, etc.
* Throw keyword - Based on a condition, we can throw exception with custom message. 
* Custom exceptions should extend from Exception class
* Throws keyword - If we want to send the exception to calling method then we use throws Exception. The calling method should handle it. It is also called ducking the exception. Throws can be used for unchecked exception.

## User input variables
* println is the method of PrintStream class
* finally block will always run regardless of exception

## Threads
* A class extending Thread can be executed as thread
* The class should have run method
* It is advisable to use implements Runnable interface rather than extends Threads
* Make Thread safe using synchronized key word to avoid race condition or deadlock situation
* Thread states: New, Runnable, Running, Waiting or Blocked, Dead

## Collection
* Interfaces
* List, Queue, Set extends from Collection interface
* List -> Arraylist, LinkedList
* Queue -> DeQueue
* Set -> HashSet, LinkedHashSet, 
* Sorting - 

## Collection API
* Stores data, linked-list, dynamic array, 
* This is concept

## Map
* Map does not extend from Collection, however it is part of collection API
* Map keys are unique so Map internally uses Set to manage them. Map values can have duplicates, so internally Map manages it as List.
* use HashTree if we use threads or use HashMap

## Collections
* It is a class from java.util package
* This has method to sort the array and several other methods

# Steams
* It is always advisable to use Immutable values. 
* Mutable objects - objects that can be changed
* Immutable objects - objects once created can not be changed.
* Stream can be oprated only once, example filter, map, reduce, etc.
* Using streams we can create builder pattern by creating single line statements