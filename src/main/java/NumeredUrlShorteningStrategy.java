import java.util.concurrent.atomic.AtomicInteger;

public class NumeredUrlShorteningStrategy implements URLShortenerStrategy{

    private static final String SHORT_URL_PREFIX = "https://short.url/";
    private AtomicInteger counter = new AtomicInteger(1);
    @Override
    public String shortenUrl(String longUrl) {
        return SHORT_URL_PREFIX + counter.incrementAndGet();
    }
}
