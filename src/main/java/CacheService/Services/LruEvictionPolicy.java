package CacheService.Services;

import CacheService.Entities.Cache;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LruEvictionPolicy implements EvictionPolicy {
    Queue<String> cacheObjects = new LinkedList<String>();

    @Override
    public void keyAccessed(String key) {
        String poll = cacheObjects.poll();
        cacheObjects.add(poll);
    }

    @Override
    public String evict( Cache cache) {
        String poll = cacheObjects.poll();
        return poll;
    }
}
