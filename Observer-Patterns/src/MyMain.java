public class MyMain {
	public static void main(String[] args) {
		//Create an observer window and a controller window.
		//The controller window will be observed.
		PropertyChangeWindow propWindow = new PropertyChangeWindow();
		new ControllerWindow(propWindow);
	}
}
