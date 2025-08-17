package mg;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mg.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public @interface InterfaceC15616b {
    boolean nullSafe() default true;

    Class<?> value();
}
