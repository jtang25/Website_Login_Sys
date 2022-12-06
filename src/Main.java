import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Main {
    public static JFrame mainPanel;
    public static introPage introPage;
    public static loginPage loginPage;
    public static registerPage registerPage;

    public static void main(String[] args) {
        mainPanel = new JFrame();
        loginPage = new loginPage();
        registerPage = new registerPage();
        introPage = new introPage();
        introPage.setSize(400,400);
        mainPanel.add(registerPage);
        mainPanel.add(introPage);
        mainPanel.add(loginPage);
        introPage.setVisible(true);
        loginPage.setVisible(false);
        registerPage.setVisible(false);
        mainPanel.setVisible(true);
        mainPanel.setSize(400,400);
    }
}