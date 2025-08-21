package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class DynamicTypesKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return kotlinType.N0() instanceof DynamicType;
    }
}
