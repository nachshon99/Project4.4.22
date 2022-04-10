import java.awt.*;

public class Brick {
    private Rectangle brick;

    public Brick(){
        this.brick = new Rectangle(95,50,250,100, Color.green);
    }

    public void moveRight(){
        this.brick.moveRight();
    }
    public void moveLeft(){
        this.brick.moveLeft();
    }
    public void moveUp(){
        this.brick.moveUp();
    }
    public void moveDown(){
        this.brick.moveDown();
    }

    public void paint(Graphics graphics){
        this.brick.paint(graphics);
    }
}
