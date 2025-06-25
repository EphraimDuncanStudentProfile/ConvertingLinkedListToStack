Analysis  
Code Analysis for StackMaintained.java  
Author: Ephraim Duncan  
Date: 06-17-2025  

Project structure:  
Class is Conversion.  
Methods include the following:  
  1. main(String[] args) – serves as the program entry point.  
  2. addIntegers(Stack<Integer> numberStack) – handles user input and add to the stack.  
  3. showStack(Stack<Integer> numberStack) – sorts and optionally demonstrates LIFO behavior.  

This program is still a single-class design no change here from last week.  

Reuse of code / Java Collections:  
  1. Stack<Integer> – Reuses Java’s built-in Stack from the Collections Framework, instead of creating a stack manually.  
  2. Collections.sort() – Reuses Java’s sort method to order elements in ascending order before optional popping functionality.  

Encapsulation:  
The main() function is declared public which is the only way it'll run.  
The helper methods addIntegers() and showStack() are private, which helps encapsulate functionality and hides implementation details following good object-oriented design principles.  

SOLID Principles:  
(S) Single Responsibility – Each method has one job.  
(O) Open/Closed – The code is easily extensible, such as the optional LIFO pop() logic was added without modifying existing logic.  
(L) Liskov Substitution – Uses Stack<Integer> directly, which still extends Vector and implements List, preserving interface substitutability.  
    A hypothetical example: List<Integer> numList = new Stack<>(); still holds true.  
(I) Interface Segregation – Uses simple, focused interfaces  
(D) Dependency Inversion – No not yet at this scale.  

Law of Demeter:  
Each method only interacts with direct collaborators (local variables or passed parameters), there is also no chaining. It's all clean. 

Summary:  
The StackCoversion project retains strong adherence to SOLID principles and encapsulation. It reuses the pre-built in Java methods, as well as literally follows the same concept of last week's project. I literally just changed the names and words kept functionality either the same or slightly enhanced.
Its structure allows clean maintenance tasks, such as adding optional behavior without redesigning the program. This updated version shows the transition from LinkedList to Stack in a disciplined and minimal change fashion, with good design practices throughout the project.
