import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeWord extends JFrame{
    private JPanel mainPanel;
    private JTextField WordTextField;
    private JButton WordButton;
    private JButton RedButton;
    private JButton YellowButton;
    private JButton GreenButton;
    private JButton BlueButton;
    private JButton BigButton;
    private JButton SmallButton;

    public ChangeWord(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        WordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WordTextField.setText("Hello World!");
            }
        });
        RedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WordTextField.setForeground(Color.RED);
            }
        });
        YellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WordTextField.setForeground(Color.YELLOW);
            }
        });
        GreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WordTextField.setForeground(Color.GREEN);
            }
        });
        BlueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WordTextField.setForeground(Color.BLUE);
            }
        });
        BigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Text t = new Text();
            }
        });
        SmallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ChangeWord("Change Word");
        frame.setVisible(true);
        frame.setSize(600,400);
    }
}
