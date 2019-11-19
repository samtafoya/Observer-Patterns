import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertySubject {

	String property = "";
	PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public void addObserver(PropertyChangeListener l) {
		pcs.addPropertyChangeListener(l);
	}
	
	// functions the same as Observable's change data class
	public void setProperty(String str) {
		String old = property;
		property = str;
		pcs.firePropertyChange(str, old, property);
	}

}
