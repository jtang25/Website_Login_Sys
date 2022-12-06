import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Main {
    public static introPage introPage;
    public static loginPage loginPage;
    public static registerPage registerPage;

    public static void main(String[] args) {
        loginPage = new loginPage();
        loginPage.setSize(400,400);
        registerPage = new registerPage();
        registerPage.setSize(400,400);
        introPage = new introPage();
        introPage.setSize(400,400);
        introPage.setVisible(true);
        registerPage.setVisible(false);
        loginPage.setVisible(false);
    }
}