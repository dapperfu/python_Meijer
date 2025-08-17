package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class UtilsKt {
    public static final AnnotationDescriptor a(LazyJavaResolverContext c10, JavaWildcardType wildcardType) {
        AnnotationDescriptor next;
        Intrinsics.j(c10, "c");
        Intrinsics.j(wildcardType, "wildcardType");
        if (wildcardType.x() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<AnnotationDescriptor> it = new LazyJavaAnnotations(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AnnotationDescriptor annotationDescriptor = next;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.f()) {
                if (Intrinsics.e(annotationDescriptor.e(), fqName)) {
                    break loop0;
                }
            }
        }
        return next;
    }

    public static final boolean b(CallableMemberDescriptor memberDescriptor) {
        Intrinsics.j(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof FunctionDescriptor) && Intrinsics.e(memberDescriptor.r0(JavaMethodDescriptor.f144364H), Boolean.TRUE);
    }

    public static final boolean c(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.j(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(JavaNullabilityAnnotationSettingsKt.e()) == ReportLevel.f144278e;
    }

    public static final DescriptorVisibility d(Visibility visibility) {
        Intrinsics.j(visibility, "<this>");
        DescriptorVisibility descriptorVisibilityG = JavaDescriptorVisibilities.g(visibility);
        Intrinsics.i(descriptorVisibilityG, "toDescriptorVisibility(...)");
        return descriptorVisibilityG;
    }
}
