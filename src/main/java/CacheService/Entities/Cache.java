package CacheService.Entities;

import CacheService.Services.CacheOperations;
import CacheService.Services.EvictionPolicy;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Cache implements CacheOperations {
    int cacheId;
    HashMap<String,String> keyValuePairs;
    EvictionPolicy evictionPolicy;
    int capacity;

    Cache(int cacheId,EvictionPolicy evictionPolicy,int capacity){
        this.cacheId=cacheId;
        this.keyValuePairs=new HashMap<>();
        this.evictionPolicy=evictionPolicy;
        this.capacity=capacity;
    }

    @Override
    public String get(String key) throws Exception {
        if(keyValuePairs.isEmpty())
        {
           throw new Exception("Cache is empty, key not found");
        }

        else if(!keyValuePairs.containsKey(key))
            throw new Exception("Key not found");
        else{
            evictionPolicy.keyAccessed(key);
            return keyValuePairs.get(key);
        }

    }

    @Override
    public void put( String key,String value) {
        if(keyValuePairs.size()>capacity){
            System.out.println("Max capacity reached, evicting");
            String evict = evictionPolicy.evict(this);
            keyValuePairs.remove(evict);
        }
        keyValuePairs.put(key,value);
    }
}
