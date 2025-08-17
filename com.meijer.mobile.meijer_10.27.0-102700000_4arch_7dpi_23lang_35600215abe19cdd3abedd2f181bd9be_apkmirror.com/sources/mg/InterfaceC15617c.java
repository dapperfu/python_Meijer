package mg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mg.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public @interface InterfaceC15617c {
    String[] alternate() default {};

    String value();
}
