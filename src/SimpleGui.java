import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class SimpleGui extends JFrame {
    private JButton btn = new JButton("PRESS");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("input");
    private JRadioButton radioButton1 = new JRadioButton("select t");
    private JRadioButton radioButton2 = new JRadioButton("select d");
    private JCheckBox checkBox = new JCheckBox("input");

    public SimpleGui() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        container.add(radioButton1);
        radioButton1.setSelected(true);
        container.add(radioButton2);
        container.add(checkBox);

        btn.addActionListener(new ButtonEventListener());
        container.add(btn);

    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "btn war pressed\nText is" + input.getText() + "\n";
            message += (radioButton1.isSelected()) ? "Radio 1" : "Radio 2" + " is selected\n";
            message += "Checkbox is" + ((checkBox.isSelected()) ? "checked" : "unchecked" + "\n");
            JOptionPane.showMessageDialog(null,message ,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
