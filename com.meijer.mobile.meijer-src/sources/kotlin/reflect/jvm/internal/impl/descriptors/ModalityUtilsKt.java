package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ModalityUtilsKt {
    public static final boolean a(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        return classDescriptor.q() == Modality.f144526b && classDescriptor.f() != ClassKind.f144494d;
    }
}
