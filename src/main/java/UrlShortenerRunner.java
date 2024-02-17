import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UrlShortenerRunner {
    public  static  void main(String args[]) {
        URLShortenerStrategy urlShortenerStrategy = new RandomUrlShortenStrategy();
        String url = "https://www.example.com";
        UrlShortener urlShortener = new UrlShortener(urlShortenerStrategy);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for( int i=0;i<10;i++) {
            executorService.execute(() -> {
                String shortUrl = urlShortener.shortenUrl(url);
                System.out.println("Thread" + Thread.currentThread()
                        .getName() + "shortened URL:" + shortUrl);
            });
        }

        executorService.shutdown();
    }
}
