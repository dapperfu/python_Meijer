package og;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: og.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public @interface InterfaceC16128d {
    double value();
}
