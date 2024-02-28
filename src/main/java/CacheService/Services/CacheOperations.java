package CacheService.Services;

public interface CacheOperations {
    String get(String key) throws Exception;

    void put(String key,String value);
}
