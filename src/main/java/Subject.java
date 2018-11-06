public interface Subject {
    void regObserver (Observer observer);
    void removeObserver (Observer observer);
    void notifyObserver ();
}
