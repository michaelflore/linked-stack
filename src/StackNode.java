public class StackNode<T> {
    //Fields
    private T value;
    private StackNode<T> link;

    //Default constructor
    public StackNode() {
        value = null;
        link = null;
    }

    //Overloaded constructor
    public StackNode(T val, StackNode<T> next) {
        value = val;
        link = next;
    }

    //Returns value of node
    public T getValue() {
        return value;
    }

    //Returns link of node
    public StackNode<T> getNext() {
        return link;
    }

    //Sets value of node
    public void setValue(T val) {
        value = val;
    }

    //Sets link of node
    public void setNext(StackNode<T> next) {
        link = next;
    }

    //Overridden toString() method
    public String toString() {
        String str = (String) value;
        return str;
    }
}