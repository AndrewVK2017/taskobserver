
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTest {
    private final Logger logger = new Logger();
    private final Observer observer = new ConsolLogObserver("Logging console event - ");

    @Before
    public void beforeTest(){
        logger.getObservers().clear();
        logger.regObserver(observer);
    }

    @Test
    public void regObserver() {
        logger.regObserver(observer);
        Assert.assertEquals(2, logger.getObservers().size());
    }

    @Test
    public void removeObserver() {
        logger.removeObserver(observer);
        Assert.assertEquals(0, logger.getObservers().size());
    }

    @Test
    public void notifyObserver() {

    }

    @Test
    public void setEvent() {
        logger.setEvent("test");
        Assert.assertEquals("test", logger.getEvent());
    }

}
