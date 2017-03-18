import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by deft on 16.03.2017.
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN : " + issn);
        return issn;
    }
}
