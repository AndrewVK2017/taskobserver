public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.regObserver(new ConsolLogObserver("Logging console event - "));
        logger.regObserver(new FileLogObserver("C:/temp/temp.txt"));

        logger.setEvent("Event1");
        logger.setEvent("Event2");
        logger.setEvent("Event3");
        logger.setEvent("Event4");
        logger.setEvent("Event5");
        logger.setEvent("Event6");
        logger.setEvent("Event7");
        logger.setEvent("Event8");
        logger.setEvent("Event9");
        logger.setEvent("Event10");

    }
}
