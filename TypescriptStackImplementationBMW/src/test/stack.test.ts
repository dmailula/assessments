import {StackImp} from "../app/stack/StackImp";

describe('stack', () => {
   
    test('has element with value of 42 pushed into it', () => {
        const stack = new StackImp<any>(Infinity);
        stack.push(42);        
        expect(stack.pop()).toEqual(42);                
    });

    test('has a values pushed to the array and first in last out', () => {
        const stack = new StackImp<any>(Infinity);
        stack.push(42);
        stack.push(66);
        stack.push(99);
        expect(stack.pop()).toEqual(99);        
        expect(stack.pop()).toEqual(66);        
        expect(stack.pop()).toEqual(42);        
    });

    test('is newly-created, empty and not full', () => {
        const stack = new StackImp<any>(Infinity);
        expect(stack.empty()).toBe(true);        
    });

    test('has a array size of 2 after two elements pushed', () => {
        const stack = new StackImp<any>(Infinity);
        stack.push(42);
        stack.push(66);
        expect(stack.count()).toEqual(2);     
    });

    test('is emptied after popping all elements', () => {
        const stack = new StackImp<any>(Infinity);
        stack.push(42);
        stack.push(66);
        stack.push(99);
        expect(stack.pop()).toBe(99);
        expect(stack.pop()).toBe(66);
        expect(stack.pop()).toBe(42);
        expect(stack.empty()).toBe(true);
    });

    test('is empty before pushing data and not empty afterwards', () => {
        const stack = new StackImp<any>(Infinity);
        expect(stack.empty()).toBe(true);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        expect(stack.empty()).toBe(false);
    });
});