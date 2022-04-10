import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameScene extends JPanel implements ActionListener,MouseListener {
    public static final int SLEEP_TIME = 5;

    private Board board;
    private Brick brick1;
    private Brick brick2;
    private Brick brick3;

    public GameScene(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        this.setDoubleBuffered(true);
        board = new Board();
        brick1 = new Brick();
        brick2 = new Brick();
        brick3 = new Brick();
        this.mainGameLoop();
        Movement movement = new Movement(brick1);
        MouseClickEvent mouseClickEvent = new MouseClickEvent();
        this.addKeyListener(movement);
        this.setFocusable(true);
        this.requestFocus();

    }
    private void mainGameLoop(){
        Thread thread1 = new Thread(() -> {
            while (true){
                try {
                    repaint();
                    Thread.sleep(SLEEP_TIME);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.board.paint(graphics);
        this.brick1.paint(graphics);
        this.brick2.paint(graphics);
        this.brick3.paint(graphics);

    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
    public void actionPerformed(ActionEvent e) {

    }
}
