# ConvertingLinkedListToStack
Author: Ephraim Duncan
Date: 06-24-2025
#Description
This is a simple Java project that creates and sorts a stack of integers using the Java Collections Framework. The user is prompted to enter integers one by one, and the program displays the sorted stack once input ends.

To execute this file please run the following commands in this order.

1. Please create bin folder in project folder to keep files clean.
   
    mkdir bin


2. StackConversion.java compiling, start commandline and enter the following:
   
    javac -d bin StackConversion.java

3. Run the program to see my code, must enter this into commandline:
   
   java -cp bin StackConversion

Note: When running the program enter a number, press enter, next number, until you enter non-integer to close program.
Example usage...
"Enter integers one at a time. Enter non-integer to finish:"
5
2
9
a

Sorted stack contents (from smallest to largest):  [2, 5, 9]


4. To produce the java docs please enter this:
   
   javadoc -d doc StackConversion.java
-----------------------------------------------------------------------------------------------------------------------------------
Optional running
Uncomment the bottom commented code in showStack() this will pop in order of how the stack works, Last In First Out meaning the 
largest value wil pop first, then the second largest.... so on and so forth.
First save the uncommenting which may require opening a text editor/ IDE then saving, Go back to project folder re-open terminal, then re compile and re-run using these 2 previous commands in this order.

1. javac -d bin StackConversion.java

2. java -cp bin StackConversion
