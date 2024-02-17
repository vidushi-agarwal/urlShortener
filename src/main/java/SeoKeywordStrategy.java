public class SeoKeywordStrategy implements URLShortenerStrategy{

    private static final String SHORT_URL_PREFIX = "https://short.url/";
    private String keyword ;
    public SeoKeywordStrategy(String keyword){
        this.keyword = keyword;
    }
    @Override
    public String shortenUrl(String longUrl) {
        StringBuilder builder = new StringBuilder();
        builder.append(SHORT_URL_PREFIX).append(keyword);
        return builder.toString();
    }
}
