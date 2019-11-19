import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PropertyChangeWindow implements PropertyChangeListener {
	
	private JLabel label;

	// CONSTRUCTOR
	PropertyChangeWindow() {
		JFrame frame = new JFrame("Property Change Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}

	// functions the same as Observer's update()
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		label.setText(evt.getPropertyName());		
	}

}
