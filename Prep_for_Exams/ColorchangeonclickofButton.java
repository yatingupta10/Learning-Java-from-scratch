import java.awt.*;
import java.awt.event.*;

public class ColorchangeonclickofButton extends Frame implements ActionListener{
	Button b1 = new Button("Red");
	Button b2 = new Button("Green");
	Button b3 = new Button("Yellow");

	public ColorchangeonclickofButton(){
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
		setSize(500, 500);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1)
				setBackground(Color.red);
		if(ae.getSource()==b2)
				setBackground(Color.green);
		if(ae.getSource()==b3)
				setBackground(Color.yellow);
	}

	public static void main(String args[]){
		new ColorchangeonclickofButton();
	}
}