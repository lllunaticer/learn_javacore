package stack_definition;

public class TestStack {
    public static void main(String[] args){
        StackPersonal<String> a = new StackPersonal<>();
        a.InitStack();
        System.out.println(a.size+" "+a.bottom+" "+a.top);
        System.out.println("添加顶部");
        a.Push("i am all right");
        a.Push("Fine");
        a.Push("Get away from me");
        a.Push("I miss you");
        System.out.println("弹出顶部"+a.Pop());
        System.out.println("弹出顶部"+a.Pop());
        System.out.println("弹出顶部"+a.Pop());
        System.out.println("弹出顶部"+a.Pop());
//        System.out.println("获取顶部"+a.GetTop());
//        System.out.println("弹出顶部"+a.Pop());
//        System.out.println("获取顶部"+a.GetTop());
//        System.out.println("是否为空？"+a.StackEmpty());
//        System.out.println("获取长度"+a.StackLength());
//      //  a.ClearStack();
//        System.out.println("是否为空？"+a.StackEmpty());
    }
}
