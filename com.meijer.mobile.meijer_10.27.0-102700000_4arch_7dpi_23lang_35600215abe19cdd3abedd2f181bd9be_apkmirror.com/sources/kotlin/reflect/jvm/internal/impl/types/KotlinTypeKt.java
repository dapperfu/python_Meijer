package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* loaded from: classes13.dex */
public final class KotlinTypeKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeN0 instanceof FlexibleType) && (((FlexibleType) unwrappedTypeN0).R0() instanceof ErrorType);
    }

    public static final boolean b(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return TypeUtils.l(kotlinType);
    }
}
