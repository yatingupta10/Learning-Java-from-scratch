import java.awt.*;

class CardLayoutusingFrame extends Frame{
	CardLayoutusingFrame(){
		Button b1  = new Button("Red");
		setLayout(new CardLayout());
		add(b1);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String args[]){
		new CardLayoutusingFrame();
	}
}