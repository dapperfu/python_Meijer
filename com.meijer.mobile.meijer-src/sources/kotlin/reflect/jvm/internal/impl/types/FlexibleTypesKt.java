package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FlexibleTypesKt {
    public static final FlexibleType a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        Intrinsics.h(unwrappedTypeN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (FlexibleType) unwrappedTypeN0;
    }

    public static final boolean b(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return kotlinType.N0() instanceof FlexibleType;
    }

    public static final SimpleType c(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeN0).S0();
        }
        if (unwrappedTypeN0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeN0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SimpleType d(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeN0).T0();
        }
        if (unwrappedTypeN0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeN0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
