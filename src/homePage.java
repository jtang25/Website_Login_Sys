import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePage extends JPanel{
    private JPanel panel = new JPanel();

    homePage(){
    }

    private void listen(){
        JButton login = new JButton("Login");
        JButton register = new JButton("Register");
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.loginPage.show();

            }
        });
    }
}
