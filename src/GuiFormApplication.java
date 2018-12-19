import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GuiFormApplication extends JFrame{

    JFrame frame = new JFrame();
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    //Components
    

    public void generateWindow(){
        frame.setVisible(true);
        frame.setTitle("Odwrotny koder binarny");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(screen.width/4,screen.height/4);
        frame.setSize(screen.width/2,screen.height/2);

    //Adding components

    }

    public static void main(String[] args) {
        GuiFormApplication frame = new GuiFormApplication();
        frame.generateWindow();
    }
}
