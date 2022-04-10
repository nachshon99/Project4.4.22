import javax.swing.*;
import java.awt.image.ImageObserver;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 800;

    public static void main(String[] args) {
        Window window = new Window();
    }

    public Window(){
        this.setTitle("Unblock It");
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        GameScene gameScene = new GameScene(0,0,WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);
    }

}
