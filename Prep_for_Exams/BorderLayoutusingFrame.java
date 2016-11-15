import java.awt.*;

class BorderLayoutusingFrame extends Frame{
	BorderLayoutusingFrame(){
		Button b1  = new Button("Red");
		Button b2 = new Button("Green");
		Button b3 = new Button("Yellow");
		Button b4 = new Button("Black");
		Button b5 = new Button("White");
		setLayout(new BorderLayout());
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String args[]){
		new BorderLayoutusingFrame();
	}
}