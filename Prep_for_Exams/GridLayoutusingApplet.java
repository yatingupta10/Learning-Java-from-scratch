import java.awt.*;
import java.applet.*;

public class GridLayoutusingApplet extends Applet{
	Button b1  = new Button("Red");
	Button b2 = new Button("Green");
	Button b3 = new Button("Yellow");
	Button b4 = new Button("Black");
	Button b5 = new Button("White");

	public void init(){
		setLayout(new GridLayout(2,3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(500, 500);
		setVisible(true);
	}
}
/* 
<applet code="GridLayoutusingApplet.class" width="300" height="300"> 
</applet> 
*/  