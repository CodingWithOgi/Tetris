import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MainWindow mainWindow = new MainWindow();
        mainWindow.setTitle("Tetris");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 800);
        //mainWindow.pack();
        mainWindow.setVisible(true);
        mainWindow.getTetrisPanel().move();
    }
}