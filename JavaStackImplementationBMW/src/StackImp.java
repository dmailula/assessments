import java.util.Stack;

/**
 * Class for implementing stack data structure of any type
 *
 * @author Raphasha Donald Mailula
 * @version 1.0
 */
public class StackImp{

    Stack<Object> stackElements = new Stack<>();

    /**
     * Creates an empty Stack.
     */
    public StackImp() {
    }

    /**
     * Adding element on the top of the stack
     *
     * @param o the integer to add
     */
    public void push(Object o){
        stackElements.add(count(), o);
    }

    /**
     * Retrieving element from the stack on the iterator index
     *
     * @return the added object
     */
    public Object pop(){
        if(!isEmpty()) {
            int size = count();
            Object e = null;
            try {
                e = stackElements.get(--size);
                stackElements.remove(e);
                return e;
            } catch (ArrayIndexOutOfBoundsException ex){
                return ex.getClass();
            }
        }
        return null;
    }

    /**
     * Checking if the stack has any values
     *
     * @return true if the stack is empty using the count implementation of
     * false inverse
     */
    public boolean isEmpty(){
        return count() == 0;
    }

    /**
     * Counting the number of values on the stack
     *
     * @return integer value of the stack size
     */
    public int count(){
        return stackElements.size();
    }
}
