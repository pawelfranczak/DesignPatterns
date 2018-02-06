package Observer;

public interface IObservable {

	public void addObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyAllObservers(Object object);
	
}
