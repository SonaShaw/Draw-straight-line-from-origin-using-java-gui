package assignment_2_2;

import javax.swing.JFrame;




public class Paint1 {

	
	PaintMouse1 paintMouse1;
	
	

	public Paint1() {
	
		JFrame jfrm = new JFrame("Simple frame :");
		jfrm.setSize(500,500);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		paintMouse1 = new PaintMouse1();
		jfrm.add(paintMouse1);
		jfrm.setVisible(true);
	}
		
}
