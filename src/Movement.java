import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement implements KeyListener {
    Brick brick = new Brick();
    public Movement(Brick brick){
        this.brick = brick;
    }
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_LEFT:{
                this.brick.moveLeft();
            }
            case KeyEvent.VK_RIGHT:{
                this.brick.moveRight();
            }
            case KeyEvent.VK_UP:{
                this.brick.moveUp();
            }
            case KeyEvent.VK_DOWN:{
                this.brick.moveDown();
            }
        }
    }
    public void keyReleased(KeyEvent e) {

    }
}
