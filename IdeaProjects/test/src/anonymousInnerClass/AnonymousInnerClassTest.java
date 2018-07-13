package anonymousInnerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class AnonymousInnerClassTest {
    public static void main(String[] args){
        Talkingclock t = new Talkingclock();
        t.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}

class Talkingclock{
    public void start(int aInterval, boolean aBeep){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("the time is " + new Date());
                if(aBeep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(aInterval, listener);
        t.start();

    }
}
