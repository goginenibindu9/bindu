import java.awt.*;
import java.awt.event.*;

class KeyEventDemo extends Frame implements KeyListener {

    Label l;

    KeyEventDemo() {

        l = new Label();

        l.setBounds(50, 100, 200, 30);

        addKeyListener(this);

        add(l);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String args[]) {
        new KeyEventDemo();
    }
}
