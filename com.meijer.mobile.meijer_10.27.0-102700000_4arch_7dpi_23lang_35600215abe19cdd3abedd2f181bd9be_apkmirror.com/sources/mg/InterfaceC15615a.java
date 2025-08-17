package mg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public @interface InterfaceC15615a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
