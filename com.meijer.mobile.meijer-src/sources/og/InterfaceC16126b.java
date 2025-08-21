package og;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: og.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public @interface InterfaceC16126b {
    boolean nullSafe() default true;

    Class<?> value();
}
