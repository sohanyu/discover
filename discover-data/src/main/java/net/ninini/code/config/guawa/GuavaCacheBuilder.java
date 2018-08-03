package net.ninini.code.config.guawa;

import com.google.common.cache.Cache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * 应用内缓存
 *
 * @author luojilab
 */
@Component
public class GuavaCacheBuilder {

    private static Cache<String, Object> CACHES = null;

    public static final String LOG_LOG_CACHE = "LOG";

    /**
     * 学习人数本地缓存 10秒(1分钟过长)
     */
    private static Cache<String, Object> STUDY_COUNT_CACHES = null;

    @Value("${guava.cache.process.second:200}")
    private long expireTime;

    @PostConstruct
    public void init() {
        CACHES = com.google.common.cache.CacheBuilder.newBuilder()
                /**
                 * 设置元素最大个数
                 */
                .maximumSize(10000)
                /**
                 * 写入进程内缓存之后保存时间
                 */
                .expireAfterWrite(expireTime, TimeUnit.SECONDS)
                /**
                 * 缓存使用软引用 gc时回收
                 */
                .softValues()
                .build();
        STUDY_COUNT_CACHES = com.google.common.cache.CacheBuilder.newBuilder()
                /**
                 * 设置元素最大个数
                 */
                .maximumSize(1000)
                /**
                 * 写入进程内缓存之后保存时间
                 */
                .expireAfterWrite(10, TimeUnit.SECONDS)
                /**
                 * 缓存使用软引用 gc时回收
                 */
                .softValues()
                .build();
    }

    public Cache<String, Object> getCache() {
        return CACHES;
    }

    public Cache<String, Object> getCacheWithType(String cacheType) {
        switch (cacheType) {
            case LOG_LOG_CACHE:
                return STUDY_COUNT_CACHES;
            default:
                return CACHES;
        }
    }
}
