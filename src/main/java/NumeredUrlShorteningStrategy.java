import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class NumeredUrlShorteningStrategy implements URLShortenerStrategy{

    private static final String SHORT_URL_PREFIX = "https://short.url/";
    private Random random = new Random();
    @Override
    public String shortenUrl(String longUrl) {
        return SHORT_URL_PREFIX +random.nextInt(100);
    }
}
