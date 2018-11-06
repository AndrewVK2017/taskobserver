public class ConsolLogObserver implements Observer {
    private String massage;
    private String massageEvent;

    public ConsolLogObserver(String massage) {
        this.massage = massage;
    }

    @Override
    public void update(String event) {
        massageEvent = massage + event;
        System.out.println(massageEvent);
    }

    public String getMassageEvent() {
        return massageEvent;
    }
}