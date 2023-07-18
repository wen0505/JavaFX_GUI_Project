import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ColorGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField ColorTextField;
    private JButton RedButton;
    private JButton GreenButton;
    private JButton BlueButton;
    private JButton YellowButton;

    public ColorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        RedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ColorTextField.setForeground(Color.RED);
            }
        });
        GreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ColorTextField.setForeground(Color.GREEN);
            }
        });
        BlueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ColorTextField.setForeground(Color.BLUE);
            }
        });
        YellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ColorTextField.setForeground(Color.YELLOW);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ColorGUI("Change Color");
        frame.setVisible(true);
    }
}
