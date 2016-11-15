import java.awt.*;

class GridBagLayoutusingFrame extends Frame{
	GridBagLayoutusingFrame(){
		Button b1  = new Button("Red");
		Button b2 = new Button("Green");
		Button b3 = new Button("Yellow");
		Button b4 = new Button("Black");
		Button b5 = new Button("White");
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
      	gbc.gridx = 0;
      	gbc.gridy = 0;
		add(b1, gbc);
		
		gbc.gridx = 1;
      	gbc.gridy = 0;
		add(b2, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
      	gbc.ipady = 20;   
      	gbc.gridx = 0;
      	gbc.gridy = 1;
		add(b3, gbc);
		
		gbc.gridx = 1;
      	gbc.gridy = 1; 
		add(b4);
		// add(b5);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String args[]){
		new GridBagLayoutusingFrame();
	}
}