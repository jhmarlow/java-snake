package java_snake;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {

    private final int B_WIDTH = 300;
    private final int B_HEIGHT = 300;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 140;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;

    public Board() {
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        loadImages();
        initGame()
    }

    private void loadImages() {
        ImageIcon iid = new ImageIcon(getClass().getResource(name));
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon(getClass().getResource(name));
        ball = iia.getImage();

        ImageIcon iih = new ImageIcon(getClass().getResource(name));
        ball = iih.getImage();
    }

    private void initGame() {
        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 -z * 10;
            y[z] = 50;
        }
        locateApple();

        // we use a tuner ib a tuner to call action performed method at fixed delay
        timer = new Timer (DELAY, this)
        timer.start()
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {
        if (inGame) {
            g.drawImage(apple, apple_x, apple_y, this)

            for (int z = 0; z < dots; z++) {
                if 
            }
        }
    }




}



// import java.awt.GridLayout;

// import javax.naming.InitialContext;
// import javax.swing.JFrame;

// public class Frame extends JFrame {
//     public Frame() {
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setTitle("snake");
//         setResizable(false);

//         init();

//     }
// }
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
