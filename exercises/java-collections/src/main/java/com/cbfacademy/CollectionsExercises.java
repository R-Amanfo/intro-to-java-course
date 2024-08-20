package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        integers.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        //  - add another 2 as the last element of the list
        integers.addLast(2);
        //  - add 4 as the 3rd element of the list
        integers.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
     System.out.println(integers.element());
        //  - return the list
        return integers; 
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stackIntegers = new Stack<>();
        stackIntegers.add(5);
        stackIntegers.add(6);
        stackIntegers.add(8);
        stackIntegers.add(9);
        System.out.print(stackIntegers.getFirst());
        //A: stackIntegers.firstElement()
        System.out.print(stackIntegers.getLast());
        //A: stackIntegers.lastElement()
        System.out.print(stackIntegers.pop());
        stackIntegers.push(4);
        return stackIntegers;
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> dequeIntegers = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        dequeIntegers.add(5);
        dequeIntegers.add(6);
        dequeIntegers.add(8);
        dequeIntegers.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(dequeIntegers.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(dequeIntegers.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(dequeIntegers.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(dequeIntegers.element());
        //  - return the queue
        return dequeIntegers;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashIntegers = new HashMap<Integer, String>();
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        hashIntegers.put(1, "TypeScript");
        hashIntegers.put(2, "Kotlin");
        hashIntegers.put(3, "Python");
        hashIntegers.put(4, "Java");
        hashIntegers.put(5, "JavaScript");
        hashIntegers.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
       System.out.print(hashIntegers.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(hashIntegers.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashIntegers.containsValue("English"));
        //  - return the map
        return hashIntegers;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
