import java.awt.*;

public class Board {
    private Rectangle board;

    public Board(){
        this.board = new Rectangle(90 ,40,800,700, Color.BLACK);
    }

    public void paint(Graphics graphics) {
        this.board.paint(graphics);
    }
}
