import javax.swing.*;
import java.lang.*;

public class Main {
    public static JFrame mainFrame;
    public static introPage introPage;
    public static loginPage loginPage;
    public static registerPage registerPage;

    public static void main(String[] args) {
        mainFrame = new JFrame();
        introPage = new introPage();
        mainFrame.add(introPage);
        loginPage = new loginPage();
        mainFrame.add(loginPage);
        loginPage.setVisible(false);
        registerPage = new registerPage();
        mainFrame.add(registerPage);
        loginPage.setVisible(false);
    }
}