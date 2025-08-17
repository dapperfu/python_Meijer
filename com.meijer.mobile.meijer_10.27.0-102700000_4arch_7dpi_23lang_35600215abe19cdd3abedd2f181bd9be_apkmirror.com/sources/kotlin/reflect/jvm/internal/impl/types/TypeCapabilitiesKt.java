package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class TypeCapabilitiesKt {
    public static final CustomTypeParameter a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        Object objN0 = kotlinType.N0();
        CustomTypeParameter customTypeParameter = objN0 instanceof CustomTypeParameter ? (CustomTypeParameter) objN0 : null;
        if (customTypeParameter == null || !customTypeParameter.B0()) {
            return null;
        }
        return customTypeParameter;
    }

    public static final boolean b(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        Object objN0 = kotlinType.N0();
        CustomTypeParameter customTypeParameter = objN0 instanceof CustomTypeParameter ? (CustomTypeParameter) objN0 : null;
        if (customTypeParameter != null) {
            return customTypeParameter.B0();
        }
        return false;
    }
}
