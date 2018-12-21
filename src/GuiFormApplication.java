import net.miginfocom.swing.MigLayout;
import org.jdesktop.xswingx.PromptSupport;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class GuiFormApplication extends JFrame{

    JFrame frame = new JFrame();
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    Converter converter;
    //Components
    JPanel jPanel = new JPanel();
    JButton jButton = new JButton("Wykonaj!");
    JTextField jTextField1 = new JTextField(39);
    JTextField jTextField2 = new JTextField(39);
    JLabel jLabelTitle = new JLabel("Odwrócony szyfr Binarny",SwingConstants.CENTER);
    JComboBox<String> jComboBox = new JComboBox<>();

    public void generateWindow(){
    /* Frame config */
    // ------------------------------------------------------------------------------------------------

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(screen.width/4,screen.height/4);
        frame.setSize(screen.width/2,screen.height/2);
        frame.add(jPanel);
        frame.setResizable(false);

    // ------------------------------------------------------------------------------------------------
    /* Panel edit */
        jPanel.setBackground(new Color(204,204,204));
        jPanel.setLayout(new MigLayout("wrap 2"));
        jPanel.setBorder(new EmptyBorder(40,frame.getWidth()/6,0,0));

        jPanel.add(jLabelTitle,"span,wrap 15");
        jPanel.add(jButton,"span 1");
        jPanel.add(jComboBox,"wrap 40");
        jPanel.add(jTextField1,"span 2, wrap 15");
        jPanel.add(jTextField2,"span");

        PromptSupport.setPrompt("Wpisywana liczba (Maksumalna ilość cyfr = 26)",jTextField1);
        PromptSupport.setPrompt("Rezultat",jTextField2);


    /* Editing components */

        // ---> JButton
        // ------------------------------------------------------------------------------------------------

        jButton.addActionListener( e -> {
            if(jComboBox.getSelectedIndex() == 0) {
                if (jTextField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Nie podałeś PIN-u");
                } else {
                    JOptionPane.showMessageDialog(null, "Twoj pin to: " + jTextField1.getText());
                    converter = new Converter(jTextField1.getText());
                    jTextField2.setText(converter.toDecReversed());
                    jTextField1.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Do zrobienia");
            }
        });

        // ---> JTextField1
        // ------------------------------------------------------------------------------------------------

        jTextField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(!Character.isDigit(e.getKeyChar()) || jTextField1.getText().length()>25){
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Not important for now
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Not important
            }
        });

        // ---> JTextField1
        // ------------------------------------------------------------------------------------------------

            jTextField2.setEditable(false);

        // ---> JLabelTitle
        // ------------------------------------------------------------------------------------------------

            jLabelTitle.setFont(new Font("Serif", Font.BOLD, 40));

        // ---> JComboBox
        // ------------------------------------------------------------------------------------------------
            jComboBox.addItem("Szyfruj");
            jComboBox.addItem("Deszyfruj");

        // ------------------------------------------------------------------------------------------------
        // Set Visible musi być tutaj (ładowanie komponentów musi być wcześniej niż setVisible())
            frame.setVisible(true);
    }

    public static void main(String[] args) {
        GuiFormApplication frame = new GuiFormApplication();
        frame.generateWindow();
    }
}
