/**
 * Main driver class for checking  the implementation of
 * stack data structure
 *
 * @author Raphasha Donald Mailula
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        stackImp.push(66);
        stackImp.push(99);

        System.out.println ( "pop -> "+ stackImp.pop() );
        System.out.println ( "pop -> "+ stackImp.pop() );
        System.out.println ( "pop -> "+ stackImp.pop() );
    }
}
