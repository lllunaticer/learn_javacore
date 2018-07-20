package list;
/**
* @author Xingjian LONG
 * The single ended list. It is encouraged to add or delete elements at the head.
 * It can be used as a stack. Tail serves as bottom and head serves as top.
 * the structure of the SingleList:
 * null-->tail-->next-->...-->prev-->current-->next-->...-->prev-->head-->null
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
    public Node<E> getNode(int index) {
        if(index<=0||index>size){
            System.out.println("索引越界");
            return null;
        }
        else{
            Node<E> f = tail;
            for(int i=1;i<index;i++)//即使判断条件不成立，也会执行一次
                f = f.next;
            return f;
        }
    }
//get the elment when specified an index
    public E get(int index){
        Node<E> f = getNode(index);
        if(f==null){
            System.out.println("No such a element in the list");
            return null;
        }else{
            return f.elment;
        }
    }

    @Override
/*    public int locateElement(E element) {
        if(element==null){
            for(Node<E> f=tail; !(f==head&&f.elment==null);){

            }
        }

        return 0;
    }
    */
    //return all the indexes of the specified element in the lists, if the element is not included in the list
    //It will go through all the lists from the tail
    //return null and report the notifications.
    //Maybe rely on the implementation of equalTo function.
    public String locateElement(E element) {
        String s = " ";
        int count=0;
        //equals treat differently between null and an object
        if(element==null){
            for(Node<E> f=tail; f!=head;){
                count++;
                if(f.elment==null)
                    //better to use StringBuilder rather than String to realize string concatenation
                    s = s + count + " ";
                f = f.next;
            }
            return s;
        } else{
                for(Node<E> f =tail;f!=head;){
                    count++;
                    if(element.equals(f.elment))
                        s = s + count + " ";
                    f = f.next;
                }
                if (s == " "){
                    System.out.println("No such element found!");
                }
                return s;
        }
    }

    @Override
    //insert the Element before the specified indexed position
    //return true if the list is changed
    public boolean insert(int i, E e) {
        Node<E> f = getNode(i);
        if(f==null){
            System.out.println("The location is out of reach.");
            return false;
        }else{
            //if i indexes the tail of the list
            if(f.prev == null){
                Node<E> newNode = new Node<>(null, e, f);
                tail = newNode;
                f.prev = tail;
                size++;
            }else{
                Node<E> newNode = new Node<>(f.prev, e, f);
                Node<E> g = f.prev;
                g.next = newNode;
                f.prev = newNode;
                size++;
            }
            return true;
        }
    }

    //add element to the head
    public boolean add(E element){
        if(head==null){
            Node<E> newNode = new Node<>(null, element, null);
            head = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
            size++;
        }else{
            Node<E> newNode = new Node<>(head, element, null);
            head.next = newNode;
            head = newNode;
            size++;
        }
        return true;
    }

    @Override
    //delete the element at specified index.
    //return true if the list is changed
    public boolean delete(int i) {
        Node<E> f = getNode(i);
        if(f==null){
            System.out.println("the index is not of boundary");
            return false;
        }else{
            //if i is the tail
            if(f.prev==null){
                tail = tail.next;
                f.next = null;
                f.elment = null;
                size--;
            }
            //if i is the head
            if(f.next==null){
                head=head.prev;
                f.prev=null;
                f.elment=null;
                size--;
            }else{
                //prev-->f-->next
                f.prev.next = f.next;
                f.next.prev = f.prev;
                f.prev=null;
                f.next=null;
                f.elment=null;
                size--;
            }
            return true;
        }
    }

    @Override
    //delete the specified element in the list, return true if the list is changed.
    public boolean delete(E e) {
        String s= locateElement(e);
        if(s==" "){
            System.out.println("No such an element in the list");
            return false;
        }
        else{
            String[] s1 = s.split(" ");
            for(String s2:s1){
                int i = Integer.parseInt(s2);
                delete(i);
                size--;
            }
            return true;
        }
    }

}
