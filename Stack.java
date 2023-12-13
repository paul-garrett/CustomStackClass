import java.util.ArrayList;
// # Custom Stack Class

// ### Write the Java code to create a generic Stack class that can hold any type of object.

// ### Use an ArrayList implementation of a stack.

// ![Stack Operations](StackOperations.png)

// # Include the following operations:
// - ### size() should return the number of items in the stack.
// - ### isEmpty() should return true/false if the stack contains no items.
// - ### top() should return, but not remove the top element of the stack.
// - ### push(E) should attempt to push the element in parenthesis onto the stack.
// - ### pop() should remove and return the top element of the stack.

// # Writing and Testing Your Code

// ### Write a little at a time and test it before moving on to the next part

// ### Constructor first - You need to be able to construct the stack object in your main method first.

// ### One method at a time - Write a method and then test it before writing the other methods.

// ### Which method is the simplest to test? Write that one first.

// ### Slowly build the class one peice at a time and it will be much easier to test and debug.

class Stack {
  // Variables
  private ArrayList ourStack;

  // Constructor
  public Stack() {
    ourStack = new ArrayList();
    ourStack.add("banana");
  }

  // Methods
  public int size() {
    // size = ArrayList.size();
    // return size;
    return ourStack.size();
  }

  public boolean isEmpty() {
    if (ourStack.size() == 0) {
      return true;
    } else {
      return false;
    }
  }

  // public E top() {
  //   return ourStack.get(ourStack.size()-1);
  // }
