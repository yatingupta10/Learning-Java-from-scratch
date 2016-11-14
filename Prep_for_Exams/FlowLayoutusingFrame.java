import java.awt.*;

class FlowLayoutusingFrame extends Frame{
	FlowLayoutusingFrame(){
		Button b1  = new Button("Red");
		Button b2 = new Button("Green");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String args[]){
		new FlowLayoutusingFrame();
	}
}