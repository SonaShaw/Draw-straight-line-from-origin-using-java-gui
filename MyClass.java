package assignment_2_2;

import javax.swing.SwingUtilities;



public class MyClass {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Paint1 paint1 = new Paint1();
			}
		});


	}

}
