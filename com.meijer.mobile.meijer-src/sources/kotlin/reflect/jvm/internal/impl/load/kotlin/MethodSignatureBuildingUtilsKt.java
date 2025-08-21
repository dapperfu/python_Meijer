package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes14.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final String a(SignatureBuildingComponents signatureBuildingComponents, ClassDescriptor classDescriptor, String jvmDescriptor) {
        Intrinsics.j(signatureBuildingComponents, "<this>");
        Intrinsics.j(classDescriptor, "classDescriptor");
        Intrinsics.j(jvmDescriptor, "jvmDescriptor");
        return signatureBuildingComponents.m(MethodSignatureMappingKt.f(classDescriptor), jvmDescriptor);
    }
}
