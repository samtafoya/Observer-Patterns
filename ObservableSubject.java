import java.util.Observable;

public class ObservableSubject extends Observable {

    ObservableSubject() {
        super();
    }
    void changeData(Object data) {
    	 // The two methods of Observable class
        setChanged();
        notifyObservers(data);
    }
}

