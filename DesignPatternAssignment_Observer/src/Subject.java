public interface Subject {
    void registerObservers(Observer o);
    void notifyObservers();
}
