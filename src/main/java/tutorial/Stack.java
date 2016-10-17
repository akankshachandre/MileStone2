package tutorial;

public class Stack<T> {
  private static final int capacity = 10;
  private int pointer  = 0;
  private T[] objects = (T[]) new Object[capacity];
  
  
  /** Function to push values in stack.
   * @param object.
   */
  public final void push(final T object) {
    if (pointer >= capacity) {
      throw new IllegalArgumentException("Stack exceeded capacity!");
    }
    objects[pointer++] = object;
  }
  
  /** Function to remove element from stack.
   * @return object
   */
  
  public final T Pop() {
    if (pointer <= 0) {
      throw new IllegalArgumentException("Stack empty");
    }
    return objects[--pointer];
  }
  
  /** Method to check if the stack is empty.
   * @return integer
   */
  
  public final boolean isEmpty() {
    return pointer <= 0;
  } 
}
