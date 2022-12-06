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
        loginPage.setVisible(false);
        registerPage = new registerPage();
        registerPage.setVisible(false);
        introPage = new introPage();
        introPage.setSize(400,400);
        introPage.setVisible(true);
        mainPanel.add(introPage);
        mainPanel.setVisible(true);
        mainPanel.setSize(400,400);
    }
}