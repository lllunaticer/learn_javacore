package list;
/**
* @author Xingjian LONG
 * The single ended list. It is encouraged to add or delete elements at the head.
 * It can be used as a stack. Tail serves as bottom and head serves as top.
* */

public class SingleList<E> extends MyList<E>{

    /*Constructor*/
    public SingleList(){
        super();
    }
    public SingleList(Node<E> h, Node<E> t){
        super(h, t);
    }

    /*funtion field*/

    @Override
    public boolean isEmpty() {
        return size<=0;
    }

    @Override
    public boolean clearList() {
        if(isEmpty())
            return false;
        else{
            for(Node<E> x=head; x!=null;){
                Node<E> next = x.prev;
                x.elment = null;
                x.prev = null;
                x.next = null;
                x = next;
            }
            head = tail =null;
            size = 0;
            return true;
        }
    }

    @Override
    //count from the tail of the list, to get the specified element in the list indexed by given index
    public E get(int index) {
        if(index<=0||index>size){
            System.out.println("索引越界");
            return null;
        }
        else{
            Node<E> f = tail;
            for(int i=0;i<=index;i++)
                f = f.next;
            return f.elment;
        }
    }

    @Override
    //return all the indexes of the specified element in the lists, if the element is not included in the list
    //return null and report the notifications.
    //rely on the implementation of equalTo function.
    public int locateElement(E element) {
        
        return 0;
    }
}
