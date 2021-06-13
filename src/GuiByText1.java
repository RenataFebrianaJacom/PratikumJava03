
import javax.swing.*;

public class GuiByText1 extends JFrame {
    GuiByText1(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.setVisible(true);
    }
}
