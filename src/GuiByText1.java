
import javax.swing.*;

public class GuiByText1 extends JFrame {

    JLabel label1 = new JLabel("Coba Input 1");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton("Greet");

    GuiByText1(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakkankomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField1);

        label1.setBounds(16,32,100,25);
        textField1.setBounds(124,32,100,25);
        button1.setBounds(232,32,80,25);

    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.setVisible(true);
    }
}
