import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayOut implements ActionListener{
    private JFrame window;
    private JLabel textLabel;
    private JPanel panel;
    private JButton startButton;



    public LayOut() {

        createLabel("Bubba",250,250,200,50);
        createWindow();




    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==startButton){
            System.out.println("Start");

        }
    }




    public void createLabel(String txt, int x, int y, int width,int height){
        textLabel = new JLabel();
        textLabel.setText(txt);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("MV Boli",Font.PLAIN,20));

        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setBounds(x,y,width,height);


    }
    public void createWindow(){
        window = new JFrame();
        window.setTitle("JavaGame Roguelite");
        window.setSize(800,600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        ImageIcon image = new ImageIcon("C:\\Users\\richi\\OneDrive\\Desktop\\STREAM\\depression.PNG");
        window.setIconImage(image.getImage());
        window.setVisible(true);

        window.add(textLabel);

        startButton = new JButton();
        startButton.setBounds(200,100,100,50);
        startButton.addActionListener(this);

        window.add(startButton);

    }


    public JLabel getTextLabel(){
        return textLabel;
    }
    public JFrame getWindow(){
        return window;
    }
    public JPanel getPanel(){
        return panel;
    }
}
