package com.squareup.moshi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes12.dex */
public @interface g {
    boolean ignore() default false;

    String name() default "\u0000";
}
