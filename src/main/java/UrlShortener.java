public class UrlShortener {
    private URLShortenerStrategy urlShortenerStrategy;
   public UrlShortener(URLShortenerStrategy urlShortenerStrategy){
       this.urlShortenerStrategy = urlShortenerStrategy;
   }
   public synchronized String shortenUrl(String url){
       return urlShortenerStrategy.shortenUrl(url);
   }
}
