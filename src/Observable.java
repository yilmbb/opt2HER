public interface Observable {
    void add(Observer o);
    void notifyObservers();
}
