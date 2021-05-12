package com.work.Annotation_;

import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface to {
    String value() default "";
}
