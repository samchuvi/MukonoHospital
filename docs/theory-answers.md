# Theory Answers

1. Abstract methods have no body because the parent class knows what behaviour is needed but not how each subclass will do it.
2. An abstract class is a partial blueprint meant to be inherited. A subclass must implement its abstract methods.
3. Yes, an abstract class can contain normal methods with bodies, which subclasses inherit.
4. Yes, an abstract class can have constructors. They run through super(...) when a subclass object is created.
5. Constructors initialize the common fields in one place so no subclass leaves shared data uninitialized.
