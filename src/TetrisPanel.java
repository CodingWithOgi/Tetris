import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.util.Random;
import java.awt.image.BufferedImage;

public class TetrisPanel extends JPanel {
    private Image[][] blocks;
    private Image currentBlock;
    private int xCoord;
    private int yCoord;
    private Dimension preferredSize;
    int randnum,q;
    private boolean dirXRight = true;
    private boolean dirYDown = true;
    TetrisPanel(){
        this.blocks = new Image[7][4];
        for(int j=0;j<4;j++){
            for(int i=0;i<7;i++){
                this.blocks[i][j] = new ImageIcon("Sources/block"+(i+1)+"."+j+".png").getImage();
            }
        }


        Random rand = new Random();
        randnum = rand.nextInt(7);
        System.out.println(randnum);
        q=0;
        this.currentBlock = blocks[randnum][0];
        this.xCoord = 150;
        this.yCoord = 0;
        this.preferredSize = new Dimension(400,800);
    }

    public void left() {
        xCoord -= 5;
        repaint();
    }
    public void right() {
        xCoord += 5;
        repaint();
    }
    public void up() {
        q++;
        q%=4;
        currentBlock = blocks[randnum][q];
        repaint();
    }
    public void down() {
        yCoord += 5;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        System.out.println("risuvam "+randnum+" "+q+" na "+xCoord+" "+yCoord);
        //graphics.drawImage(blocks[4*randnum+q], xCoord, yCoord, this);
        graphics.drawImage(currentBlock, xCoord, yCoord, this);
    }
    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public void move(){

        int width = 400;
        int height = 400;
        int dx = 3;
        int dy = 3;
        int radius = 5;
        int x=0;
        int y=0;
        while(true) {
            down();
            if(xCoord>800) break;
        /*if(xCoord+25>width)
            dirXRight=false;
        else
            dirXRight=true;

        if(yCoord+25>height)
            dirYDown=false;
        else
            dirYDown=true;


        if(dirXRight)
            right();
        else
            left();

        if(dirYDown)
            down();
        else
            up();

         */
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e){
                }
        }
    }
}
