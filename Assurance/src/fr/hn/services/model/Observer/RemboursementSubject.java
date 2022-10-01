package fr.hn.services.model.Observer;

public interface RemboursementSubject {

	public void addObserver(RemboursementObserver weatherObserver);

	public void removeObserver(RemboursementObserver weatherObserver);

	public void sendNotification();
}
