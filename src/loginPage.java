import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JPanel {
    private JButton submit;
    private JTextArea passwordTextBox;
    private JTextArea usernameTextBox;

    loginPage(){
        usernameTextBox = new JTextArea();
        usernameTextBox.setPreferredSize(new Dimension(350,10));
        passwordTextBox = new JTextArea();
        passwordTextBox.setPreferredSize(new Dimension(350,10));
        submit = new JButton(">");
        submit.setPreferredSize(new Dimension(50, 10));
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Server.verifyLogin(usernameTextBox.getText(), passwordTextBox.getText())){

                }
            }
        });
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
    }
}
