package xyz.ruankun.houseadmin.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 存储token,就不需要redis了, redis这个渣渣, 这里用不上
 */
public final class TokenPoolUtil {

    // mili scds
    private final static long EXPIRE = 1800 * 1000;
    // 最多支持100人登录
    private final static int POOL_SIZE = 100;

    public final static int POOL_IS_FULL = -100;
    public final static int OK = 1;
    public final static int UNKNOWN_ERROR = -1;

    // <用户Id, <参数, 值>>   里面map有俩参数 token  /  expire
    private static  ConcurrentHashMap<String, Map<String, Object>> tokenPool
            = new ConcurrentHashMap<>(POOL_SIZE);

    private TokenPoolUtil(){}


    public static Integer setToken(String userId, String token){
        if (tokenPool.size() >= POOL_SIZE){
            //满了
            cleanPool();
            if (tokenPool.size() >= POOL_SIZE){
                return POOL_IS_FULL;
            }
        }
        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("create", new Date());
        // 存了两个进去
        if (null != tokenPool.put(userId, tokenMap) && null != tokenPool.put(token, tokenMap)){
            return OK;
        }else {
            return UNKNOWN_ERROR;
        }
    }
    public static String getTokenByUid(String userId){
        Map<String, Object> map = tokenPool.get(userId);
        long out = (((Date)map.get("create")).getTime() + EXPIRE) - (new Date().getTime());
        if (null != map && out > 0){
            //没过期
            return (String)map.get("token");
        }else{
            return null;
        }

    }

    /**
     * 通过token查询
     * @param token
     * @return
     */
    public static String getTokenByToken(String token){
        return getTokenByUid(token);
    }


    private static void cleanPool(){
        //暂时偷个懒，乱做一个吧
        tokenPool = new ConcurrentHashMap<>();
    }


}
