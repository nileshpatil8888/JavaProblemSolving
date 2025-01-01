LinkedList :
    What is Linked list :
        A linked list is a linear data structure where elements, called nodes, are stored in a sequence. Unlike arrays, linked lists do not store elements in contiguous memory locations. Each node contains two parts:
        Data: The actual data or value of the node.
        Pointer (or Link): A reference or address to the next node in the sequence.

    Types of Linked list :
        Singly linked list : 
            Each node points to the next node. The last node points to null.
        Doubly linked list :
            Each node contains two pointers:
            One pointing to the next node.
            One pointing to the previous node.
        Circular linked list : 
            The last node points back to the first node, forming a circle. This can be singly or doubly linked.

    Structure of Linked list : 
        class Node {
            int val;
            Node next;
        }

    