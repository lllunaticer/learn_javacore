package list;

public class test {
    public static void main(String[] args){
            SingleList<Double> a =new SingleList<>();
            for(int i = 1;i<10;i++){
                a.add(i*2.52);
            }
            System.out.println(a.length());
            System.out.println(a.get(2));
            a.delete(2);
            System.out.println(a.length());
            System.out.println(a.get(2));
            a.insert(2, 2.2);
            System.out.println(a.get(2));
            System.out.println(a.isEmpty());
            System.out.println(a.length());
            System.out.println(a.locateElement(3.2));
            a.delete(2.2);
            System.out.println(a.length());
            a.clearList();
            System.out.println(a.isEmpty());
            System.out.println(a.length());

    }
    }
