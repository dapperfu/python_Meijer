package com.scandit.datacapture.tools.internal.sdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0013\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007R\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/tools/internal/sdk/ProxyReversedAdapter;", "", "value", "Lkotlin/reflect/KClass;", "owner", "provided", "", "()Ljava/lang/Class;", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes11.dex */
public @interface ProxyReversedAdapter {
    Class<?> owner() default Void.class;

    boolean provided() default false;

    Class<?> value();
}
