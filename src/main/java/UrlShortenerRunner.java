public class UrlShortenerRunner {
    public  static  void main(String args[]) {
        URLShortenerStrategy urlShortenerStrategy = new RandomUrlShortenStrategy();
        String url = "https://www.example.com";
        UrlShortener urlShortener = new UrlShortener(urlShortenerStrategy);
        String shortUrl = urlShortener.shortenUrl(url);
        System.out.println(shortUrl);
    }
}
