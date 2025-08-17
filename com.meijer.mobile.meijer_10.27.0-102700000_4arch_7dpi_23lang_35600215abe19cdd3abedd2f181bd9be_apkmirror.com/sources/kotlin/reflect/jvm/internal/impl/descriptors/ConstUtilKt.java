package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* loaded from: classes13.dex */
public final class ConstUtilKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return ((KotlinBuiltIns.t0(kotlinType) || UnsignedTypes.d(kotlinType)) && !TypeUtils.l(kotlinType)) || KotlinBuiltIns.w0(kotlinType);
    }
}
