package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean c(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return InlineClassesUtilsKt.g(declarationDescriptor) && !a((ClassDescriptor) declarationDescriptor);
    }

    public static final boolean d(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return classifierDescriptorD != null && ((InlineClassesUtilsKt.b(classifierDescriptorD) && c(classifierDescriptorD)) || InlineClassesUtilsKt.i(kotlinType));
    }

    public static final boolean f(CallableMemberDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor = descriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) descriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.g(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor classDescriptorA0 = classConstructorDescriptor.a0();
        Intrinsics.i(classDescriptorA0, "getConstructedClass(...)");
        if (InlineClassesUtilsKt.g(classDescriptorA0) || DescriptorUtils.G(classConstructorDescriptor.a0())) {
            return false;
        }
        List<ValueParameterDescriptor> listH = classConstructorDescriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.i(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean a(ClassDescriptor classDescriptor) {
        return Intrinsics.e(DescriptorUtilsKt.o(classDescriptor), StandardNames.f144223w);
    }

    private static final boolean b(KotlinType kotlinType, boolean z10) {
        TypeParameterDescriptor typeParameterDescriptor;
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            typeParameterDescriptor = (TypeParameterDescriptor) classifierDescriptorD;
        } else {
            typeParameterDescriptor = null;
        }
        if (typeParameterDescriptor == null) {
            return false;
        }
        if ((!z10 && InlineClassesUtilsKt.d(typeParameterDescriptor)) || !e(TypeUtilsKt.o(typeParameterDescriptor))) {
            return false;
        }
        return true;
    }

    private static final boolean e(KotlinType kotlinType) {
        if (d(kotlinType) || b(kotlinType, true)) {
            return true;
        }
        return false;
    }
}
