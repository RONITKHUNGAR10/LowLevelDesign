package CacheService.Entities;

import CacheService.Services.EvictionPolicy;

import java.util.HashMap;


//proxy design pattern
public class CacheProxy {

   Cache getCache(int cacheId,  EvictionPolicy evictionPolicy, int capacity){
       return new Cache(cacheId,evictionPolicy,capacity);
   }
}
