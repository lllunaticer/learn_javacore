package innerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {
    public static void main(String[] args){
    Talkingclock clock = new Talkingclock(1000, true);
    clock.start();

    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
    }
}

class Talkingclock{
    private int interval;
    private boolean bee;

    public Talkingclock(int aInterval, boolean aBee){
        this.interval = aInterval;
        this.bee = aBee;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(this.interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("the time is: " + new Date());
            if(bee) Toolkit.getDefaultToolkit().beep();
        }
    }

}
