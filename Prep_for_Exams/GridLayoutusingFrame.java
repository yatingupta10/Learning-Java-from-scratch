import java.awt.*;

class GridLayoutusingFrame extends Frame{
	GridLayoutusingFrame(){
		Button b1  = new Button("Red");
		Button b2 = new Button("Green");
		Button b3 = new Button("Yellow");
		Button b4 = new Button("Black");
		Button b5 = new Button("White");
		setLayout(new GridLayout(2,3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String args[]){
		new GridLayoutusingFrame();
	}
}