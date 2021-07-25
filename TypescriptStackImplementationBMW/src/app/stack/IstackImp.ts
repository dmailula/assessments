/**
 * Interface to define the stack structure implementation
 * @author Raphasha Donald Mailula
 * @version 1.0
 */
export interface IStackImp<T> {
    push(item: T): void;
    pop(): T | any;
    empty(): T | boolean;
    count(): number;
}