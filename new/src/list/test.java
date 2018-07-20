package list;

public class test {
    public static void main(String[] args){
            SingleList<Double> a =new SingleList<>();
            for(int i = 1;i<10;i++){
                a.add(i*2.52);
            }
            System.out.println(a.get(1));
        }
    }
