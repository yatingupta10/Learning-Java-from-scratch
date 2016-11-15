import java.awt.*;
import java.applet.*;

public class CardLayoutusingApplet extends Applet{
	Button b1  = new Button("Red");

	public void init(){
		setLayout(new CardLayout());
		add(b1);
		setSize(500, 500);
		setVisible(true);
	}
}
/* 
<applet code="CardLayoutusingApplet.class" width="300" height="300"> 
</applet> 
*/  