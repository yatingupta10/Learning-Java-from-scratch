import java.awt.*;
import java.applet.*;

public class FlowLayoutusingApplet extends Applet{
	Button b1  = new Button("Red");
	Button b2 = new Button("Green");
		
	public void init(){
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		setSize(500, 500);
		setVisible(true);
	}
}
/* 
<applet code="FlowLayoutusingApplet.class" width="300" height="300"> 
</applet> 
*/  