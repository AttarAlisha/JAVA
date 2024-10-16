import javax.swing.*;
import java.awt.event.*;

public class KeyMouseEventsFrame extends JFrame implements KeyListener, MouseListener {

     JLabel keyEventLabel;
     JLabel mouseEventLabel;

    
    public KeyMouseEventsFrame() {
        
        setTitle("Key and Mouse Events");
        setSize(400, 300);

        keyEventLabel = new JLabel("Key Event: ");
        keyEventLabel.setBounds(50, 50, 300, 30);
        add(keyEventLabel);

        
        mouseEventLabel = new JLabel("Mouse Event: ");
        mouseEventLabel.setBounds(50, 50, 300, 30);
        add(mouseEventLabel);

        
        addKeyListener(this);
        addMouseListener(this);
        
        setVisible(true);

        setFocusable(true);
        requestFocusInWindow();
    }


    @Override
    public void keyPressed(KeyEvent e) {
        keyEventLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    
    @Override
    public void keyReleased(KeyEvent e) {
        keyEventLabel.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        keyEventLabel.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseEventLabel.setText("Mouse Clicked at X: " + e.getX() + " Y: " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseEventLabel.setText("Mouse Pressed at X: " + e.getX() + " Y: " + e.getY());
    }

    
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseEventLabel.setText("Mouse Released at X: " + e.getX() + " Y: " + e.getY());
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        mouseEventLabel.setText("Mouse Entered Frame");
    }

   
    @Override
    public void mouseExited(MouseEvent e) {
        mouseEventLabel.setText("Mouse Exited Frame");
    }

    public static void main(String[] args) {
        new KeyMouseEventsFrame();
    }
}
