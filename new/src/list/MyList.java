package list;
/**
 *@author Xingjian LONG
 *The abstract class of list
 * prescribed basic operation a list should provide
 * Node is a inner class for data storage.
*/

public abstract class MyList<E> {

    /*Data field*/
    Node<E> head;
    Node<E> tail;

    int size;

    /*Constructor*/
    public MyList(){
        head = tail = null;
        size = 0;
    }

    public MyList(Node<E> h, Node<E> t){
        this.head = h;
        this.tail = t;
    }

    /*Abstract Function field*/
    //check if a list is empty.
    public abstract boolean isEmpty();
    //clear a list, return true if success, false is the list is already empty
    public abstract boolean clearList();
    //get the element at given index position, null if not existed
    public abstract E get(int index);
    //get the index of a given element in the list, -1 if not existed
    public abstract int locateElement(E element);
    //insert the Element e before the given index i,
    public abstract void insert(int i, E e);
    //delete the element at the given index, return true if the list was changed
    public abstract boolean delete(int i);
    //delete the given elements in the list, return true if the list was changed
    public abstract boolean delete(E e);
    //add all the element in the list a to list b
    //public abstract void unionL(MyList<E> a);

    /*Function field*/
    public int length(){
        return size;
    }

    /*Inner class*/
    public static class Node<E>{

        E elment;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next){
            this.elment = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
