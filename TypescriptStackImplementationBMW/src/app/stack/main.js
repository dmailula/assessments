"use strict";
exports.__esModule = true;
/**
  * Main class to run the script
  * @tutorial step 1 tsc src/app/stack/main.ts
  * @tutorial step 2 node tsc src/app/stack/main.js
  * @author Raphasha Donald Mailula
  * @version 1.0
  */
var StackImp_1 = require("./StackImp");
/** Instantiating a new stack object*/
var stackImp = new StackImp_1.StackImp();
/** Adding elements to the stack*/
stackImp.push(44);
stackImp.push(66);
stackImp.push(99);
/** Outputting elements from the stack*/
console.log("pop -> " + stackImp.pop());
console.log("pop -> " + stackImp.pop());
console.log("pop -> " + stackImp.pop());
