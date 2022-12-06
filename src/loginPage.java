import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JFrame {
    private JPanel mainPanel;
    private JButton submit;
    private JTextArea passwordTextBox;
    private JTextArea usernameTextBox;

    // TODO make text box and frame size constant
    loginPage(){
        mainPanel = new JPanel();
        JPanel username = new JPanel();
        username.setLayout(new BoxLayout(username, BoxLayout.X_AXIS));
        JTextField usernameText = new JTextField("Username:");
        usernameText.setPreferredSize(new Dimension(80,50));
        usernameText.setMaximumSize(new Dimension(80,50));
        usernameText.setEditable(false);
        usernameText.setHorizontalAlignment(JTextField.LEFT);
        usernameTextBox = new JTextArea();
        usernameTextBox.setPreferredSize(new Dimension(300,50));
        usernameTextBox.setMaximumSize(new Dimension(300,50));
        usernameTextBox.setFont(usernameTextBox.getFont().deriveFont(14f));
        username.add(usernameText);
        username.add(usernameTextBox);
        // TODO make password hidden
        passwordTextBox = new JTextArea();
        passwordTextBox.setPreferredSize(new Dimension(350,10));
        passwordTextBox.setMaximumSize(new Dimension(350,10));
        passwordTextBox.setFont(passwordTextBox.getFont().deriveFont(14f));
        submit = new JButton("LOGIN");
        submit.setPreferredSize(new Dimension(50, 10));
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Server.verifyLogin(usernameTextBox.getText(), passwordTextBox.getText())){
                    System.out.println("Logged In.");
                }
                // TODO add invalid login message
                else{
                    usernameTextBox.setText("");
                    passwordTextBox.setText("");
                    System.out.println("Invalid Credentials");
                }
            }
        });
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridy = 0;
        c.gridx = 0;
        c.ipadx = 300;
        c.ipady = 10;
        c.insets = new Insets(5, 20, 5, 20);
        mainPanel.add(username, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridy = 1;
        c.gridx = 0;
        c.ipadx = 300;
        c.ipady = 10;
        c.insets = new Insets(5, 20, 5, 20);
        mainPanel.add(passwordTextBox, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridy = 2;
        c.gridx = 0;
        c.ipadx = 250;
        c.ipady = 10;
        c.insets = new Insets(20, 20, 20, 20);
        mainPanel.add(submit, c);
        usernameTextBox.setVisible(true);
        passwordTextBox.setVisible(true);
        submit.setVisible(true);
        this.add(mainPanel);
    }
}
