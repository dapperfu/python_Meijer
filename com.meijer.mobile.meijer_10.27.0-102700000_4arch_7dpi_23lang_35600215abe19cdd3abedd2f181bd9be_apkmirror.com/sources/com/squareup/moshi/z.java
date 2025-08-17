package com.squareup.moshi;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "a", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z {
    public static final Class<?> a(Type type) {
        Intrinsics.j(type, "<this>");
        Class<?> clsG = x.g(type);
        Intrinsics.i(clsG, "getRawType(this)");
        return clsG;
    }
}
