package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ModalityUtilsKt {
    public static final boolean a(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        return classDescriptor.q() == Modality.f143619b && classDescriptor.f() != ClassKind.f143587d;
    }
}
