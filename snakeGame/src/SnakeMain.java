import javax.swing.*;
public class SnakeMain extends JFrame{
    Board board;
    SnakeMain()
    {
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SnakeMain snakeMain = new SnakeMain();
    }
}