public interface LinkedStackADT<T> {
    //Checks if stack is empty
    boolean isEmptyStack();
    //Adds to stack
    void push(T value);
    //Shows value of top node in stack
    T peek() throws StackUnderflowException;
    //Removes top node in stack
    void pop() throws StackUnderflowException;
}
