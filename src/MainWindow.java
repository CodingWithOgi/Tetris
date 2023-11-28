import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener{
    private JButton leftBtn = new JButton("Left");
    private JButton rightBtn = new JButton("Right");
    private JButton upBtn = new JButton("Up");
    private JButton downBtn = new JButton("Down");

    public TetrisPanel getTetrisPanel() {
        return tetrisPanel;
    }

    private TetrisPanel tetrisPanel = new TetrisPanel();

    public MainWindow(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftBtn);
        buttonPanel.add(rightBtn);
        buttonPanel.add(upBtn);
        buttonPanel.add(downBtn);

        tetrisPanel.setBackground(Color.WHITE);
        this.add(tetrisPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        leftBtn.addActionListener(this);
        rightBtn.addActionListener(this);
        upBtn.addActionListener(this);
        downBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent buttonPressed) {
        if(buttonPressed.getSource() == leftBtn)
            tetrisPanel.left();
        else if(buttonPressed.getSource() == rightBtn)
            tetrisPanel.right();
        else if(buttonPressed.getSource() == upBtn)
            tetrisPanel.up();
        else if(buttonPressed.getSource() == downBtn)
            tetrisPanel.down();
    }
}
