package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).e0();
        }
        return null;
    }

    public static final UnwrappedType b(UnwrappedType unwrappedType, KotlinType origin) {
        Intrinsics.j(unwrappedType, "<this>");
        Intrinsics.j(origin, "origin");
        return d(unwrappedType, a(origin));
    }

    public static final UnwrappedType c(UnwrappedType unwrappedType, KotlinType origin, Function1<? super KotlinType, ? extends KotlinType> transform) {
        Intrinsics.j(unwrappedType, "<this>");
        Intrinsics.j(origin, "origin");
        Intrinsics.j(transform, "transform");
        KotlinType kotlinTypeA = a(origin);
        return d(unwrappedType, kotlinTypeA != null ? transform.invoke(kotlinTypeA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UnwrappedType d(UnwrappedType unwrappedType, KotlinType kotlinType) {
        Intrinsics.j(unwrappedType, "<this>");
        if (unwrappedType instanceof TypeWithEnhancement) {
            return d(((TypeWithEnhancement) unwrappedType).D0(), kotlinType);
        }
        if (kotlinType == null || Intrinsics.e(kotlinType, unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
