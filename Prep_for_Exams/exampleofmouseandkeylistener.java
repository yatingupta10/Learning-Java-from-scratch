import java.awt.*;
import java.awt.event.*;

public class exampleofmouseandkeylistener extends Frame implements MouseListener, KeyListener{
	public exampleofmouseandkeylistener(){
		setLayout(new FlowLayout());
		addMouseListener(this);
		addKeyListener(this);
		setVisible(true);
		setSize(500, 500);
	}

	public void mouseClicked(MouseEvent m){
		setBackground(Color.blue);
	}
	public void mousePressed(MouseEvent m){
		System.out.println("mouse pressed");
	}
	public void mouseEntered(MouseEvent m){
		System.out.println("mouse entered");
	}
	public void mouseExited(MouseEvent m){
		System.out.println("mouse exited");
	}
	public void mouseReleased(MouseEvent m){
		System.out.println("mouse released");
	}

	public void keyTyped(KeyEvent k){
		setBackground(Color.green);
	}
	public void keyPressed(KeyEvent k){
		System.out.println("key pressed");
	}
	public void keyReleased(KeyEvent k){
		System.out.println("key released");
	}

	public static void main(String args[]){
		new exampleofmouseandkeylistener();
	}
}