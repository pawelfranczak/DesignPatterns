package Observer;

import java.util.ArrayList;
import java.util.List;

public class Seller implements IObservable  {

	String name;
	SellerType type;
	List<IObserver> observers = new ArrayList<IObserver>();
	
	public Seller(String name, SellerType type) {
		this.name = name;
		this.type = type;
		System.out.println("Create new: " + this);
	}
	
	@Override
	public void addObserver(IObserver observer) {
		if (!observers.contains(observer)) {
			System.out.println(observer + " is added to list: " + this);
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(IObserver observer) {
		System.out.println(observer + " is deleted from list: " + this);
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers(Object object) {
		for (IObserver observer : observers) {
			observer.update(object);
		}
	}
	
	public void sendNewIssue(Object object) {
		notifyAllObservers(object);
	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", type=" + type + "]";
	}

}
