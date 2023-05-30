import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.border.EmptyBorder;


public class LayOut{
    private final JFrame FRAME;
    private JButton button;
    private JButton button2;
    private JPanel buttons;

    private JPanel titlePanel;

    private JLabel title;
    private Font titleFont;
    private Font buttonFont;
    private GridBagConstraints titleConstraints;
    private GridBagConstraints buttonCon;
    private GridBagConstraints titleConstraints2;

    public LayOut() {
        FRAME = new JFrame("Testing");
        button = new JButton("Start");
        button2 = new JButton("Quit");

        titlePanel = new JPanel(new GridBagLayout());
        buttons = new JPanel(new GridBagLayout() );
        title = new JLabel("Binky");
        titlePanel.setBorder(new EmptyBorder(10,10,10,10));

        titleFont = new Font("Times New Roman", Font.PLAIN,90);
        buttonFont = new Font("Times New Roman", Font.PLAIN,30);

        setTitleScreenFonts();
        startScreen();
        settingGridConstants();

        titlePanel.setBackground(Color.GRAY);

        buttons.add(button, buttonCon);
        buttons.add(button2,buttonCon);


        titlePanel.add(title,titleConstraints2);


        FRAME.add(titlePanel,titleConstraints);
        FRAME.add(buttons, titleConstraints);

        button.addActionListener(new ButtonListen());
        button2.addActionListener(new ButtonListen2());



    }
    private void settingGridConstants(){
        titleConstraints = new GridBagConstraints();
        titleConstraints.gridwidth = GridBagConstraints.REMAINDER;
        titleConstraints.weighty = 1;
        titleConstraints.anchor = GridBagConstraints.CENTER;

        buttonCon = new GridBagConstraints();
        buttonCon.gridwidth = GridBagConstraints.REMAINDER;
        buttonCon.ipadx = 85 ;
        buttonCon.weighty = 1;
        buttonCon.anchor = GridBagConstraints.CENTER;
        buttonCon.fill = GridBagConstraints.HORIZONTAL;

        titleConstraints2 = new GridBagConstraints();
        titleConstraints2.gridwidth = GridBagConstraints.REMAINDER;
        titleConstraints2.weighty = 1;
        titleConstraints2.anchor = GridBagConstraints.CENTER;
        titleConstraints2.fill = GridBagConstraints.HORIZONTAL;


    }

    private void setTitleScreenFonts(){
        title.setFont(titleFont);


        button.setFont(buttonFont);
        button2.setFont(buttonFont);
    }

    private void startScreen() {
        button.setFocusable(false);
        button2.setFocusable(false);
        FRAME.setVisible(true);
        FRAME.setSize(800, 400);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setLayout(new GridBagLayout());
        FRAME.getContentPane().setBackground(Color.WHITE);

    }

    public class ButtonListen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println("Hi!");
                buttons.remove(button);
                FRAME.getContentPane().removeAll();   // Removes everything from screen!
                FRAME.repaint();

            }

        }
    }

    public class ButtonListen2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button2) {
                System.out.println("Application has quit!");
                FRAME.repaint();
                FRAME.dispose();

            }
        }
    }




    public JLabel getTextLabel(){
        return null;
    }
    public JFrame getWindow(){
        return null;
    }
    public JPanel getPanel(){
        return null;
    }
}
