package set;
import java.util.*;
//本程序可以在命令行通过给定一个txt文件来执行：java SetTest < Alice.txt
public class SetTest {
    public static void main(String[] args){
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        try (Scanner in = new Scanner(System.in)){
            while(in.hasNext()){
                String word = in.next();
                long calltime =  System.currentTimeMillis();
                words.add(word);
                calltime = System.currentTimeMillis()-calltime;
                totalTime += calltime;
            }
        }
        Iterator<String> iter = words.iterator();
        for(int i =1; i<20&iter.hasNext();i++)
            System.out.print(iter.next()+" ");
        System.out.println("...");
        System.out.print(words.size() + "distinctive words. Take " + totalTime +" milliseconds.");
    }
}
