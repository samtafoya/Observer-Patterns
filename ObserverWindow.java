import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverWindow implements Observer {

	private JLabel label;

	// CONSTRUCTOR
	ObserverWindow() {
		JFrame frame = new JFrame("Observer Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}

	// The Observer interface requires the implementation of update() abstract method
	public void update(Observable o, Object data) {
		//Display the number of taps that occur on the observed window.
		label.setText((String) data);
	}

}