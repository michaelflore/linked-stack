public class LinkedStack<T> implements LinkedStackADT<T> {
    //Fields
    private StackNode<T> stackTop;

    //Default constructor
    public LinkedStack() {
        stackTop = null;
    }

    //Overloaded constructor
    public LinkedStack(StackNode<T> top) {
        stackTop = top;
    }

    //Copy constructor
    public LinkedStack(LinkedStack<T> stack) {
        stackTop = null;
        if (!stack.isEmptyStack()) {
            while (!stack.isEmptyStack()) {
                push((T) stack.peek());
                stack.pop();
            }
        }
        else {
            throw new StackUnderflowException();
        }
    }

    //Checks if stack is empty
    public boolean isEmptyStack() {
        if(stackTop == null) {
            return true;
        }
        return false;
    }

    //Adds to stack
    public void push(T value) {
        if(this.isEmptyStack()) {
            stackTop = new StackNode<T>(value, null);
        }
        else {
            StackNode<T> newNode = new StackNode<T>(value, stackTop);
            stackTop = newNode;
        }
    }

    //Shows value of top node in stack
    public T peek() throws StackUnderflowException {
        if(this.isEmptyStack()) {
            throw new StackUnderflowException();
        }
        return stackTop.getValue();
    }

    //Removes top node in stack
    public void pop() throws StackUnderflowException {
        if(this.isEmptyStack()) {
            throw new StackUnderflowException();
        }
        stackTop = stackTop.getNext();
    }
}
