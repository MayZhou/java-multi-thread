package com.mayzhou.learn.multi.thread.annotations;

import java.lang.annotation.*;

/**
 * @Auther: MayZhou
 * @Date: 19/3/20 05:13
 * @Description:
 * @copyright:
 * @version:
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotThreadSafe {
}
