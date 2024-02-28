package CacheService.Services;

import org.apache.logging.log4j.util.Strings;
//Factory Design Pattern
public class EvictionPolicyFactory {
    EvictionPolicy getEvictionPolicy(String policy) throws Exception {
        if(Strings.isEmpty(policy))
            throw new Exception("Policy name cannot be null");
        if(policy.equalsIgnoreCase("LRU"))
            return new LruEvictionPolicy();

        return null;
    }
}
