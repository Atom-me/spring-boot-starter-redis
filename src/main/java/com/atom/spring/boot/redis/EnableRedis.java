package com.atom.spring.boot.redis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Atom
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RedisAutoConfiguration.class)
public @interface EnableRedis {
}
