import javax.swing.*;

public class Main {
    //
    static JFrame f = new JFrame("Pong");


    public static void main(String[] args) {
        //
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        f.setSize(650, 495);

        PongGame game = new PongGame();

        f.add(game);

        //
        f.setVisible(true);

    }
}