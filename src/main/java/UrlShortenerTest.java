import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

public class UrlShortenerTest {

    @Test
    public void testShortenUrl(){
        /* UrlShortener urlShortener = new UrlShortener();
        String originalUrl = "https://www.example.com";
        String shortUrl = "https://short.url/abc123";
        String resultUrl = urlShortener.shortenUrl(originalUrl);
        assertEquals(shortUrl, resultUrl);

         */
    }

    @Test
    public void testExpandUrl(){
        /* UrlShortener urlShortener = new UrlShortener();
        String expandUrl = "https://www.example.com";
        String originalUrl = "https://short.url/abc123";
        String resultUrl = urlShortener.expandUrl(originalUrl);
        assertEquals(expandUrl, resultUrl);
        */

    }
    @Test
    public void testRandomCharsUrlShortening(){
        String originalUrl = "https://www.example.com";
        String shortUrl = "https://short.url/abc3";
        URLShortenerStrategy urlShortenerStrategy = new RandomUrlShortenStrategy();
        String resultUrl = urlShortenerStrategy.shortenUrl(originalUrl);
        assertEquals(resultUrl.length(),shortUrl.length());

    }

    @Test
    public void testSeoKeywordUrlShortening(){
        String originalUrl = "https://www.example.com";
        String keyword = "short";
        String shortUrl = "https://short.url/"+keyword;
        UrlShortener urlShortener = new UrlShortener(new SeoKeywordStrategy(keyword));
        String resultUrl = urlShortener.shortenUrl(originalUrl);
        assertEquals(resultUrl,shortUrl );

    }

    @Test
    public void testNumberedUrlShortening(){
        String originalUrl = "https://www.example.com";
        int keyword = 2;
        String shortUrl = "https://short.url/"+keyword;
        UrlShortener urlShortener = new UrlShortener(new NumeredUrlShorteningStrategy());
        String resultUrl = urlShortener.shortenUrl(originalUrl);
        assertEquals(resultUrl,shortUrl );

    }


}