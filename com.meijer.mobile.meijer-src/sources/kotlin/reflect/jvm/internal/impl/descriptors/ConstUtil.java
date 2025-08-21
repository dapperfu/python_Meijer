package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public final class ConstUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final ConstUtil f144501a = new ConstUtil();

    @JvmStatic
    public static final boolean a(KotlinType type) {
        Intrinsics.j(type, "type");
        return ConstUtilKt.a(type);
    }

    private ConstUtil() {
    }
}
