package tutorial;

public class Stack<T> {
  private int capacity = 10;
  private int pointer  = 0;
  private T[] objects = (T[]) new Object[capacity];
  
  
  /** Function to push values in stack.
   * @param object.
   */
  public void push(T object) {
    if (pointer >= capacity) {
      throw new IllegalArgumentException("Stack exceeded capacity!");
	private int capacity = 10;
    private int pointer  = 0;
    @SuppressWarnings("unchecked")
	private T[] objects = (T[]) new Object[capacity];
    
    public void push(T o) {
	if(pointer >= capacity)
	    throw new IllegalArgumentException("Stack exceeded capacity!");
	objects[pointer++] = o;
    }
    objects[pointer++] = object;
  }
  
  /** Function to remove element from stack.
   * @return object
   */
  
  public final T pop() {
    if (pointer <= 0) {
      throw new IllegalArgumentException("Stack empty");
    }
    return objects[--pointer];
  }
  
  /** Method to check if the stack is empty.
   * @return integer
   */
  
  public boolean isEmpty() {
    return pointer <= 0;
  } 
}
