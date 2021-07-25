"use strict";
exports.__esModule = true;
exports.StackImp = void 0;
var StackImp = /** @class */ (function () {
    /**
      * Creates empty constructor of the Object and setting the
      * stack capacity to infite
      */
    function StackImp(capacity) {
        if (capacity === void 0) { capacity = Infinity; }
        this.capacity = capacity;
        this.elements = [];
    }
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param item New element of the Array.
      */
    StackImp.prototype.push = function (item) {
        if (this.count() === this.capacity) {
            throw Error("Cannot add more items, capacity reached");
        }
        this.elements.push(item);
    };
    /**
      * Checks if the array has values or returns null
      * Removes the last element from an array.
      * @returns the last element from an array
      */
    StackImp.prototype.pop = function () {
        if (!this.empty()) {
            return this.elements.pop();
        }
        return null;
    };
    /**
      * Checks if the array has elements inside
      * @returns True or False
      */
    StackImp.prototype.empty = function () {
        return this.count() == 0;
    };
    /**
      * Checks the size of the array
      * @returns True or False
      */
    StackImp.prototype.count = function () {
        return this.elements.length;
    };
    return StackImp;
}());
exports.StackImp = StackImp;
