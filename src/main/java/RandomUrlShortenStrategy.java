import java.util.Random;

public class RandomUrlShortenStrategy implements URLShortenerStrategy{
    private static final String SHORT_URL_PREFIX = "https://short.url/";
    @Override
    public String shortenUrl(String longUrl) {
        String randomCharms = getRandomChars(4);
        return SHORT_URL_PREFIX+randomCharms;
    }

    private String getRandomChars(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for( int i=0 ; i<length;i++){
            char randomChar = chars.charAt(random.nextInt(chars.length()));
            builder.append(randomChar);
        }
        return builder.toString();
    }



}
