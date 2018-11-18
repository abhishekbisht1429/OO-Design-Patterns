# Design Patterns

## Description

This repository is intended to demonstrate various Standard Design Patterns used in Object Oriented Systems.
The Language used for the implementation is **JAVA**.

**Note :** The various design patterns are closely related to each other so, in the implementations you can find one design pattern used inside another.<br/>*Eg :* An Abstract Factory is usually implemented as a Singleton Class. However I have tried not to mix the design patterns wherever possible, but in actual systems one may find all these patterns together in use.
## Structure

The design patterns can be broadly categorized into three categories[Design Patterns by gang of four] :
1. *Creational Patterns*
2. *Structural Patterns*
3. *Behavioral Patterns*

#### Creational Patterns
1. **Abstract Factory :**
  <br/> This pattern is used to instantiate objects of related classes through an interface without giving the details of concrete classes to the client.

2. **Singleton:**
  <br/> This pattern ensures that a class has only one instance and provides a global point of access to it.

3. **Builder:**
  <br/> This pattern is used to seperate object representation from its construction process.

4. **Factory Method:**
  <br/> This pattern is used when a particular class(known as Creator) does not know in advance which objects(known as products) it must create. The Creator thus uses an interface(say Product) which must be shared by all the different products that the subclasses of this class can create. The Creator necessarily declares a method(usually something like createProduct, makeProduct etc) which returns an an object of type Product. This Method is known as the *Factory Method* as it is reponsible for creation of the object(product). Thus Factory method pattern lets a class defer the Object instantiation to its subclasses.

5. **Prototype:**
    <br/> This pattern is used in the following two cases<br/>
    1. To avoid unecessary 'subclasses of an Object Creator' for each class of Object that is available for creation. Defining subclasses of Object Creator for each type of Object unnecessarily increases the number of subclasses which differ only in the type of object they create and otherwise follow the same creation procedure.
    2. To provide an alternative to creation of objects using the standard procedure (i.e using 'new') which is relatively expensive. The prototype pattern provides an alternative way to create new objects by cloning them from the prototype.

#### Structural patterns
1. **Adapter**
    <br/> This pattern is used to convert an existing interface into another interface which is compatible with the client. The entity reponsible for this conversion is known as adapter.<br/>Adpter pattern can be implemented in two ways
    1. *Class Adapter :* This implementaion uses inheritance to implent the interface of Adaptee and convert it into an interface compatible with client.
    2. *Object Adapter :* This implementation uses Object Composition to convert the interface of Adaptee. The adapter contains reference to the instance of Adaptee which it uses to interact with it via the original interface, while its own interface is the compatible one which the client expects.

2. **Bridge**
    <br/> This pattern is used to seperate the abstraction from its implementation. This allows both of them to vary independent of each other. If inheritance is used to bind an abstraction to its implementation, it causes a permanent binding. However if the implementation needs to be loosely coupled to the abstracion then the bridge pattern is used. 
