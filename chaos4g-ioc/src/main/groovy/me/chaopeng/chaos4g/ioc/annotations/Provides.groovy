package me.chaopeng.chaos4g.ioc.annotations

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * me.chaopeng.chaos4g.ioc.annotations.Provides
 *
 * @author chao
 * @version 1.0 - 2016-05-31
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Provides {
}