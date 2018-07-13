package linkedList;

import java.util.*;

public class  testLinkedListAdd {
    public static void main(String[] args) {
        List<String> mm = new LinkedList<>();
        mm.add("Ammy");
        mm.add("Bob");
        mm.add("Carl");
        mm.add(2, "good");//这种指定位置的插入操作对链表来说效率极低，不推荐使用， 需要大批量插入数据的时候，最好使用迭代器执行指定位置插入操作。
/*        Iterator iter = mm.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());*/
        for (String s:mm)
            System.out.println(s);
    }

}
