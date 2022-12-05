import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class introPage extends JPanel{
    static JButton login, register;
    public static void main (String[] args){
        login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 10));
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.loginPage.setVisible(true);
                Main.introPage.setVisible(false);
            }
        });
        register = new JButton("Register");
        register.setPreferredSize(new Dimension(100, 10));
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.registerPage.setVisible(true);
                Main.introPage.setVisible(false);
            }
        });
        JTextField textField = new JTextField("Welcome!");
        Font newTextFieldFont=new Font(textField.getFont().getName(),textField.getFont().getStyle(),40);
        textField.setFont(newTextFieldFont);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setPreferredSize(new Dimension(400,200));
        textField.setEditable(false);
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(1, 1, 1, 1);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridy = 0;
        c.gridx = 0;
        c.ipadx = 400;
        c.ipady = 10;
        p.add(textField, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 140;
        c.ipady = 10;
        p.add(login, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.ipadx = 100;
        c.ipady = 10;
        p.add(register, c);
    }
}
