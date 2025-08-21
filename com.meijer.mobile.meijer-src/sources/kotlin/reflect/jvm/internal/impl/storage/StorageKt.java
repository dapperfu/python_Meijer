package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes14.dex */
public final class StorageKt {
    public static final <T> T a(NotNullLazyValue<? extends T> notNullLazyValue, Object obj, KProperty<?> p10) {
        Intrinsics.j(notNullLazyValue, "<this>");
        Intrinsics.j(p10, "p");
        return notNullLazyValue.invoke();
    }

    public static final <T> T b(NullableLazyValue<? extends T> nullableLazyValue, Object obj, KProperty<?> p10) {
        Intrinsics.j(nullableLazyValue, "<this>");
        Intrinsics.j(p10, "p");
        return nullableLazyValue.invoke();
    }
}
