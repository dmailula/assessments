/**
  * Class for data structure implementation of the 
  * methods on IStack interface
  * @author Raphasha Donald Mailula
  * @version 1.0
  */
import { IStackImp } from './IStackImp';

export class StackImp<T> implements IStackImp<T> {
    private elements: T[] = [];
  
    /**
      * Creates empty constructor of the Object and setting the 
      * stack capacity to infite
      */
    constructor(private capacity: number = Infinity) {}

    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param item New element of the Array.
      */
    push(item: T): void {
      if (this.count() === this.capacity) {
        throw Error("Cannot add more items, capacity reached");
      }
      this.elements.push(item);
    }

    /**
      * Checks if the array has values or returns null
      * Removes the last element from an array.
      * @returns the last element from an array
      */
    pop(): T | any {
        if(!this.empty()){
            return this.elements.pop();
        }
        
        return null;
    }

    /**
      * Checks if the array has elements inside
      * @returns True or False
      */
    empty(): T | boolean {
      return this.count() == 0;
    }
  
    /**
      * Checks the size of the array
      * @returns True or False
      */
    count(): number {
      return this.elements.length;
    }
}

  