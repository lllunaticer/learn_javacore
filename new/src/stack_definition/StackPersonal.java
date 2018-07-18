package stack_definition;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackPersonal<E> {
    //data field
    int size=0;
    Node<E> top;
    Node<E> bottom;
    //method
    //新建一个空栈
    public StackPersonal(){}

    public StackPersonal(Node<E> a, Node<E> b){
        this.top = a;
        this.bottom = b;
    }

    public StackPersonal<E> InitStack(){
        StackPersonal<E> init = new StackPersonal<>(null, null);
        return init;
    }
    //销毁一个已经存在的栈
    public void DestroyStack(){}
    //清空一个栈
    public void ClearStack(){
        this.top = new Node<>(null, null, null);
        bottom = top;
        size = 0;
    }
    //判断栈是否为空
    public boolean StackEmpty(){
        return size<=0;
    }
    //若栈存在且不为空，返回栈顶元素
    public E GetTop(){
        if(this.top.item == null){
            System.out.println("the stack is empty!");
            return null;
        }
        else
            return top.item;
    }
    //压栈
    public void Push(E e){
        Node<E> g = new Node<E>(this.top, e, null);
        this.top = g;
        size++;
    }
    //弹栈
    public E Pop(){
        E a = GetTop();
        if(size==1){
            this.top = new Node<>(null, null, null);
            size--;
        }
        if(size==2){
            this.top = new Node<>(null, top.priv.item, null);
            size--;
        }
        if(size>2){
            this.top = new Node<>(top.priv.priv, top.priv.item, null);
            size--;
        }
        if(size<=0){
            this.top = new Node<>(null, null, null);
        }
        return a;
    }
    //返回栈的长度
    public int StackLength(){
        return size;
    }



    //class
    private class Node<E> {
        E item;
        Node<E> priv;
        Node<E> next;

        public Node (Node<E> priv, E item, Node<E> next){
            this.item=item;
            this.priv = priv;
            this.next = next;
        }
    }
}
