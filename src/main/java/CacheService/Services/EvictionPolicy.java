package CacheService.Services;

import CacheService.Entities.Cache;

public interface EvictionPolicy {

    void keyAccessed(String key);

    String evict(Cache cache);
}
