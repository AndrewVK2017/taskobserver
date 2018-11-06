import org.junit.Assert;
import org.junit.Test;

public class ConsolLogObserverTest {
    private final String MASSAGE = "Logging console event - ";
    private final ConsolLogObserver observer = new ConsolLogObserver(MASSAGE);

    @Test
    public void update() {
        observer.update("event1");
        Assert.assertEquals(MASSAGE + "event1", observer.getMassageEvent());
    }
}
