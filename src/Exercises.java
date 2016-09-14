public class Exercises
{
	public static void main(String[] args)
	{
		System.out.println("========Exercises from 10.4=================");
		
		/*
		Ex 10.4
		
		How does polymorphism enable you to program "in general" rather "in specific"?
		
		Polymorphism enables us to write programs that process objects that share the same superclass as if they were
		all objects of the superclass. This can simplify programming.
		
		With polymorphism, we can design and implement systems that are easily extensible. The only part of a program
		that must be altered to accommodate new classes are those that require direct knowledge of the new classes 
		that you added to the hierarchy.
		
		Discuss advantages: Polymorphism allows the reuse of code in a superclass by objects that may require only 
		specific interfaces of the code provided by the superclass. This ensures that any changes to the application
		code can be addressed is a smaller number of areas, than the need to update code throughtout many different
		areas of a program. Specifically;
			- code reuse : By putting code that is common to all of your objects in the same place, you only need
			to write that code once, and any edits to that code trickle down instantly
			
			- abstraction : Human brains can only keep track of so much stuff, but they are good at categories 
			and hierarchies. This helps understand what's happening in a big picture.
			
			- encapsulation : each class hides the details of what it is doing and just builds on the interface
			of the base class
			
			- separation of concerns : a lot of object orientated programming is about assigning responsibilities. 
			Who is going to be in charge of that? Specialized concerns can go in subclasses.
			
		
		
		Ex 10.5
		
		What are abstract methods?
		
		Abstract methods are methods contained in abstract classes. Abstract classes are incomplete. The purpose 
		of abstract classes is to provide an appropriate superclass from which other classes can inherit, and thus
		share a common design. Abstract methods do not provide implementations, .....
		
		
		
		*/
		
	}
}
