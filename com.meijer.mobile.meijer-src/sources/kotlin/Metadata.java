package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.JvmName;

@Target({ElementType.TYPE})
@SinceKotlin
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lkotlin/Metadata;", "", "kind", "", "metadataVersion", "", "bytecodeVersion", "data1", "", "", "data2", "extraString", "packageName", "extraInt", "k", "()I", "mv", "()[I", "bv$annotations", "()V", "bv", "d1", "()[Ljava/lang/String;", "d2", "xs", "()Ljava/lang/String;", "pn$annotations", "pn", "xi$annotations", "xi", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: classes4.dex */
public @interface Metadata {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @JvmName
    int[] bv() default {1, 0, 3};

    @JvmName
    String[] d1() default {};

    @JvmName
    String[] d2() default {};

    @JvmName
    int k() default 1;

    @JvmName
    int[] mv() default {};

    @JvmName
    String pn() default "";

    @JvmName
    int xi() default 0;

    @JvmName
    String xs() default "";
}
