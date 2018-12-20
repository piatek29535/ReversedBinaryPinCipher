import net.miginfocom.swing.MigLayout;
import org.jdesktop.xswingx.PromptSupport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiFormApplication extends JFrame{

    JFrame frame = new JFrame();
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    //Components
    JPanel jPanel = new JPanel();
    JButton jButton = new JButton("Wykonaj!");
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();


    public void generateWindow(){
    /* Frame config */

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(screen.width/4,screen.height/4);
        frame.setSize(screen.width/2,screen.height/2);
        frame.add(jPanel);
        frame.setResizable(false);


    /* Panel edit */
        jPanel.setBackground(new Color(204,204,204));
        jPanel.setLayout(new MigLayout("inset 30"));
        jPanel.add(jButton,"wrap");
        jPanel.add(jTextField1,"wrap");
        jPanel.add(jTextField2,"wrap");
        PromptSupport.setPrompt("Tutaj się wpisuje",jTextField1);
        PromptSupport.setPrompt("Tutaj jest rezultat",jTextField2);


    /* Adding components */

        // ---> JButton

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,jTextField1.getText());
                jTextField1.setText(null);
            }
        });


    }

    public static void main(String[] args) {
        GuiFormApplication frame = new GuiFormApplication();
        frame.generateWindow();
    }
}
