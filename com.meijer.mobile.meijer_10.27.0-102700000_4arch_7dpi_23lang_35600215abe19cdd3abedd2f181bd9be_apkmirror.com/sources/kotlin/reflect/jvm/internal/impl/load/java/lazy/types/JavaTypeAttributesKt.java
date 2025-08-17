package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JavaTypeAttributesKt {
    public static final JavaTypeAttributes a(TypeUsage typeUsage, boolean z10, boolean z11, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.j(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z11, z10, typeParameterDescriptor != null ? SetsKt.d(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes b(TypeUsage typeUsage, boolean z10, boolean z11, TypeParameterDescriptor typeParameterDescriptor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return a(typeUsage, z10, z11, typeParameterDescriptor);
    }
}
